package homeWork7.fruits;

public class Orange implements Fruit {
    private final float weight = 1.5f;

    @Override
    public String toString() {
        return "Апельсин";
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
