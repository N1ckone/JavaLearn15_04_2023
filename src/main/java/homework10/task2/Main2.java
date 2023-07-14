package homework10.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//С Executor
public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Arrays.fill(arr, 1);
        int size = arr.length;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list = new ArrayList<>();
        list.add(executorService.submit(new MyCallable(arr, 0, size / 5)));
        list.add(executorService.submit(new MyCallable(arr, size / 5, size * 2 / 5)));
        list.add(executorService.submit(new MyCallable(arr, size * 2 / 5, size * 3 / 5)));
        list.add(executorService.submit(new MyCallable(arr, size * 3 / 5, size * 4 / 5)));
        list.add(executorService.submit(new MyCallable(arr, size * 4 / 5, size)));
        int sum = list.stream().mapToInt(e -> {
            try {
                return e.get();
            } catch (InterruptedException | ExecutionException ex) {
                throw new RuntimeException(ex);
            }
        }).sum();
        System.out.println(sum);
        executorService.shutdown();
    }
}
