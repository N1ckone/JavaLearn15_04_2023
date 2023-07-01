package homework8.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.generateArrayList(10000);
        List<Integer> linkedList = Lists.generateLinkedList(10000);
        int[] elements = new int[1000];
        System.out.println("_________________Начало__________________");
        Lists.addAndShowSpeed(list, ArrayParts.BEGIN, elements);
        Lists.addAndShowSpeed(linkedList, ArrayParts.BEGIN, elements);
        System.out.println("_________________Середина__________________");
        Lists.addAndShowSpeed(list, ArrayParts.MID, elements);
        Lists.addAndShowSpeed(linkedList, ArrayParts.MID, elements);
        System.out.println("_________________Конец__________________");
        Lists.addAndShowSpeed(list, ArrayParts.END, elements);
        Lists.addAndShowSpeed(linkedList, ArrayParts.END, elements);
        System.out.println("________________Получение_________________");
        Lists.getAndShowSpeed(list, 5454);
        Lists.getAndShowSpeed(linkedList, 5454);
    }
}
