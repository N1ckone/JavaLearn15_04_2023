package homework10.task1;

import java.util.ArrayList;
import java.util.List;

public class ThreadExecutor {
    private static final LetterPrinter printer = new LetterPrinter();
    private static final List<Thread> threads = new ArrayList<>();

    public static void execute(int amountThreads, int amountLetters, int iterates) {
    setThreadList(amountThreads, amountLetters, iterates);
    threads.forEach(Thread::start);
    }

    private static void setThreadList(int amountThreads, int amountLetters, int iterates) {
        List<Character> letters = getLetters(amountLetters + 1);
        for (int i = 0; i < letters.size() - 1; i++) {
            char letter = letters.get(i);
            char nextLetter = letters.get(i + 1);
            for (int j = 0; j < amountThreads; j++) {
                threads.add(new Thread( () -> {
                    try {
                        printer.printLetter(letter, nextLetter, iterates);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }));
            }
        }
    }

    private static List<Character> getLetters(int amountLetters) {
        if(amountLetters > 27) {
            amountLetters = 27;
        }
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < amountLetters; i++) {
            char letter = (char) ('A' + i);
            if(i == amountLetters - 1) {
                letter = 'A';
            }
            letters.add(letter);
        }
        return letters;
    }
}
