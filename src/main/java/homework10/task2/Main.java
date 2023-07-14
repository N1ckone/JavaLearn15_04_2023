package homework10.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Без Executor
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        int size = arr.length;
        Arrays.fill(arr, 1);
        List<MyThread> threads = new ArrayList<>();
        threads.add(new MyThread(arr, 0, size/5));
        threads.add(new MyThread(arr, size/5, size * 2/5));
        threads.add(new MyThread(arr, size * 2/5, size * 3/5));
        threads.add(new MyThread(arr, size * 3/5, size * 4/5));
        threads.add(new MyThread(arr, size * 4/5, size));
        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(threads.stream().mapToInt(MyThread::getSum).sum());
    }
}
