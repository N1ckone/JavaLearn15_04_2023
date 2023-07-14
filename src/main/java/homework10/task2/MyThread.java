package homework10.task2;


public class MyThread extends Thread {
    private final int[] arr;
    private final int start;
    private final int end;
    private int sum;

    public MyThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
