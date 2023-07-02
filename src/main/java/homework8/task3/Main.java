package homework8.task3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyHashSet<Integer> hashSet = new MyHashSet<>();
        MyHashSet<Integer> hashSet1 = new MyHashSet<>();
        Collections.addAll(hashSet, 1, 2, 3);
        Collections.addAll(hashSet1, 3, 4, 5);
        hashSet.union(hashSet1); // 1 2 3 U 3 4 5
        hashSet.forEach(System.out::println); //1 2 3 4 5
        System.out.println("______________________________");
        hashSet.intersect(hashSet1); //1 2 3 4 5 ^ 3 4 5
        hashSet.forEach(System.out::println); // 3 4 5
    }
}
