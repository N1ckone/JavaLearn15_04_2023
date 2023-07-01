package homework8.task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {

    public static void addAndShowSpeed(List<Integer> list, ArrayParts parts, int... adding) {
        int half = list.size() / 2;
        long begin = System.currentTimeMillis();
        switch (parts) {
            case BEGIN -> Arrays.stream(adding).forEach(e -> list.add(0, e));
            case MID -> Arrays.stream(adding).forEach(e -> list.add(half, e));
            case END -> Arrays.stream(adding).forEach(list::add);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ". Время выполнения: " + (end - begin));
    }

    public static List<Integer> generateArrayList(int amountElements) {
        return Stream.generate(new Random()::nextInt).limit(amountElements).collect(Collectors.toList());
    }

    public static List<Integer> generateLinkedList(int amountElements) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < amountElements; i++) {
            list.add(new Random().nextInt());
        }
        return list;
    }

    public static Integer getAndShowSpeed(List<Integer> list, int index) {
        long begin = System.currentTimeMillis();
        Integer integer = 0;
        for (int i = 0; i < 1000; i++) {
            integer = list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " Выполнение за " + (end - begin));
        return integer;
    }
}
