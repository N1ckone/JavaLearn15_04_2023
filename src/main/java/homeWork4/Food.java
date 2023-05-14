package homeWork4;

public class Food {
    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            void cook(String str) {
                System.out.println("Готовим " + str + ".");
            }
        };
        food.prepare(cookable, "мясо");
    }
}
