package homeWork7.fruits;

public class Apple implements Fruit {
    private final float weight = 1.0f;

    @Override
    public String toString() {
        return "Яблоко";
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
