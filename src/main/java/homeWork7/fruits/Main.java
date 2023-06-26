package homeWork7.fruits;

import java.util.List;
//# 3
public class Main {
    public static void main(String[] args) {
        Box oranges = new Box();
        for (int i = 0; i < 25; i++) {
            oranges.addFruit(new Orange());
        }
        System.out.println(oranges.getWeight()); //37.5 - вес первой коробки
        Box oranges2 = new Box();
        for (int i = 0; i < 25; i++) {
            oranges2.addFruit(new Orange());
        }
        System.out.println(oranges2.getWeight()); //37.5 - вес второй коробки
        oranges.putInOtherBox(oranges2);
        System.out.println(oranges2.getWeight() ); //75.0 - вес второй коробки после перемещения
        System.out.println(oranges.getWeight()); //0 - вес первой коробки после перемещения
        Box apples = new Box();
        for (int i = 0; i < 25; i++) {
            apples.addFruit(new Apple());
        }
        System.out.println(apples.compare(oranges2)); //false
        apples.putInOtherBox(oranges2); //пытаемся добавить яблоки в апельсины
    }
}
