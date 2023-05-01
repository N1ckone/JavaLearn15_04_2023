package homeWork03_initOrder;

public class Daughter extends Mother {
    private  String name = getName();
    private static int height = getHeight();
    static{
        System.out.println("4. Статический блок инициализации класса Daughter");
    }

    {
        System.out.println("9. Нестатический блок инициализации класса Daughter");
    }

    public Daughter() {
        System.out.println("10. Конструктор класса Daughter");
    }

    public static String getName() {
        System.out.println("8. Инициализация нестатического поля класса Daughter");
        return "Kate";
    }

    public static int getHeight() {
        System.out.println("3. Инициализация статического поля класса Daughter");
        return 170;
    }
}
