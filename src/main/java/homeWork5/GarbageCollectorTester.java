package homeWork5;

public class GarbageCollectorTester {
    public static void main(String[] args) throws InterruptedException {
        User user;
        User user2;
        User user3;


        for (int i = 0; i < 10000000; i++) {
            Thread.sleep(1);
            user = new User("login", "password", 1);
            user2 = new User("login2", "password2", 2);
            user3 = new User("login3", "password3", 3);
            user = user2;
            user2 = user3;
            user3 = null;
        }

        /**
         * Ждал 550 с. после чего выключил программу.
         * За это время GC вызвался 4 раза:
         * 32 s: GC(0) 13m - 3m (освобождено около 10 мегабайт)
         * 44 s: GC(1) 18m - 4m
         * 365 s: GC(2) 41m - 3m
         * 479 s: GC(3) 10m - 4m */


    }
}
