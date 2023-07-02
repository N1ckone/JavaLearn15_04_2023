package homework8.task5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(1);
        Predicate<String> predicate = e -> e.length() > 5;
        System.out.println(predicate.test("Hello"));
        Function<Integer, Integer> function = e -> e * 2;
        System.out.println(function.apply(5));
        Supplier<int[]> supplier = () -> new int[10];
        int[] arr = supplier.get();
        MyFunctionalInterface<Double, Double> myInterface1 = new MyFunctionalInterface<Double, Double>() {
            @Override
            public Double calculate(Double element, Double element2) {
                return element / element2;
            }
        };
        System.out.println(myInterface1.calculate(15.0, 3.0));
        MyFunctionalInterface<Integer, Integer> myInterface2 = (element, element2) -> element * element2;
        System.out.println(myInterface2.calculate(15, 3));
    }
}
