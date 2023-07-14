package homework10.task1;

public class LetterPrinter {
    private final Object lock = new Object();
    private volatile char currentLetter = 'A';
    public void printLetter(char letter, char nextLetter, int iterate) throws InterruptedException {
        for (int i = 0; i < iterate; i++) {
            synchronized (lock) {
                while(currentLetter != letter) {
                    lock.wait();
                }
                System.out.print(letter + " ");
                currentLetter = nextLetter;
                lock.notifyAll();
            }
        }
    }
}
