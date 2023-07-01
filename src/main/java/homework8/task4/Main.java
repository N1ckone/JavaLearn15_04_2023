package homework8.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Nikita", 24));
        list.add(new Person("Ilya", 23));
        list.add(new Person("Tanya", 41));
        list.add(new Person("Daria", 27));
        list.add(new Person("Max", 36));
        list.add(new Person("Alex", 39));
        list.add(new Person("Zaur", 47));
        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        Comparator<Person> comparator1 = (el1, el2) -> el2.getAge() - el1.getAge();
        list.stream().sorted(comparator).forEach(System.out::println);
        System.out.println("___________");
        list.stream().sorted(comparator1).forEach(System.out::println);
    }
}
