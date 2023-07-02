package homework8.task6;

public class Main {
    public static void main(String[] args) {
        ThreeFunction threeFunction = (x, y, z) -> x * y * z;
        System.out.println(threeFunction.execute(3, 4, 5));
        ThreeFunction threeFunction1 = (x, y, z) -> {
            if ((x + y) > z) {
                return (x + y) * z;
            }
            return -1;
        };
        System.out.println(threeFunction1.execute(1, 2, 5));
    }
}
