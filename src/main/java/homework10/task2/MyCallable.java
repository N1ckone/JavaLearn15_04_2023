package homework10.task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private final int[] arr;
    private final int start;
    private final int end;
    private int sum = 0;

    public MyCallable(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
