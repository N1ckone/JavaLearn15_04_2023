package homework8.task5;

@FunctionalInterface
public interface MyFunctionalInterface<E, T> {
    E calculate(E element, T element2);
}
