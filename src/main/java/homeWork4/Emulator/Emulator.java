package homeWork4.Emulator;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Emulator implements Printable {

    private int callCount = 0;
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public void print(String message) {
        System.out.println(message);
    }

    public void execute(String message) {
        if(callCount >= 10) {
            System.out.println("Превышен лимит вызовов");
            scheduler.shutdownNow();
            return;
        }
        callCount++;
        scheduler.schedule(() -> callCount = 0, 1, TimeUnit.MINUTES);
        print(message);
    }



}
