package homeWork7.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        if(fruits.size() == 0) {
            fruits.add(fruit);
        } else {
            if(fruits.get(0) instanceof Apple && fruit instanceof Apple) {
                fruits.add(fruit);
            } else if(fruits.get(0) instanceof Orange && fruit instanceof Orange) {
                fruits.add(fruit);
            } else {
                throw new RuntimeException("Коробка состоит из " +fruits.get(0).getClass().getSimpleName()
                        + ". Поптыка добавить " + fruit.getClass().getSimpleName());
            }
        }
    }

    public float getWeight() {
       float count = 0;
        for (Fruit fruit : fruits) {
            count+= fruit.getWeight();
        }
        return count;
    }

    public void putInOtherBox(Box other) {
        for (Fruit fruit : fruits) {
            other.addFruit(fruit);
        }
        List<Fruit> empty = new ArrayList<>();
        fruits = empty;
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }
}
