package homeWork5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) throws InterruptedException {
        List<Person> persons = new ArrayList<>();
        long milis = new Date().getTime();
        while(true) {
            persons.add(new User("login", "password", 1));
            persons.add(new Worker("name", 25, 1234, "occupation"));
            System.out.println((new Date().getTime() - milis) / 1000);
        }
        /**
         * Worker - 49 %, User - 36 %
         * При heap по умолчанию программа падает через 71 секунду. Если задать -Xmx256m, то упадет за 11 секунд*/

    }
}
