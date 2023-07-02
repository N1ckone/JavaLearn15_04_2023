package homework8.task3;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet<E> extends HashSet<E> {

    public void union(Set<E> set) {
        set.forEach(this::add);
    }

    public void intersect(Set<E> set) {
        this.retainAll(set);
    }
}



