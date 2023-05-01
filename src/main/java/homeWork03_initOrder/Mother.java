package homeWork03_initOrder;

public class Mother {
    private static String number = getNumber();
    private int age = getAge();

    static {
        System.out.println("2. Статический блок инициализации класса Mother");
    }
    {
        System.out.println("6. Нестатический блок инициализации класса Mother");
    }

    public Mother() {
        System.out.println("7. Конструктор класса Mother");
    }

    public static String getNumber() {
        System.out.println("1. Инициализация статического поля класса Mother");
        return "123";
    }

    public int getAge() {
        System.out.println("5. Инициализация нестатического поля класса Mother");
        return 25;
    }
}
