import java.util.Arrays;

public class HomeWork {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte by = 127;
        short sh = 32767;
        int integer = 2_147_483_647;
        long lon = 9_223_372_036_854_775_807L;
        float fl = 30.2f;
        double doubl = 30.345;
        boolean bol = 3 > 5;
        char character = '\n';
        String string = "Hello, world";

        /*3. Написать метод вычисляющий выражение a * (b + (c / d))
         и возвращающий результат,где a, b, c, d – входные параметры этого метода; */
        System.out.println(calculate(10, 10, 10, 10));

        /*4. Написать метод, принимающий на вход два числа, и проверяющий
        что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
         */
        System.out.println(isCorrectAmount(5, 10)); //true
        System.out.println(isCorrectAmount(5, 4)); //false


        /*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.*/
        System.out.println(isPositiveOrNegativeNumber(-1)); //Отрицательное число
        System.out.println(isPositiveOrNegativeNumber(0)); //Положительное число
        System.out.println(isPositiveOrNegativeNumber(1)); //Положительное число

        /*6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
        если число отрицательное; */

        System.out.println(isNegativeNumber(-1)); //true

        /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        метод должен вывести в консоль сообщение «Привет, указанное_имя!»; */

        System.out.println(getName("Никита")); //Привет, Никита!


        /* 8 * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */
        System.out.println(isLeapYear(2023)); //Невисокосный год



        //Написать пример работы с конструкцией switch
        Months month = Months.APRIL;

        switch (month) {
            case JANUARY -> System.out.println(1);
            case FEBRUARY -> System.out.println(2);
            case MARCH -> System.out.println(3);
            case APRIL -> System.out.println(4);
            case MAY -> System.out.println(5);
            case JUNE -> System.out.println(6);
            case JULY -> System.out.println(7);
            case AUGUST -> System.out.println(8);
            case SEPTEMBER -> System.out.println(9);
            case OCTOBER -> System.out.println(10);
            case NOVEMBER -> System.out.println(11);
            case DECEMBER -> System.out.println(12);
        }

        //2) Написать пример работы с функцией System.arraycopy, вывести результаты до копирования и после

        int[] sourceArray = {1,2,3,4,5};

        int[] destArray = new int[5];

        System.out.println(Arrays.toString(destArray)); //[0, 0, 0, 0, 0]

        System.arraycopy(sourceArray, 0, destArray, 0, 5);

        System.out.println(Arrays.toString(destArray)); //[1, 2, 3, 4, 5]









    }

    public static double calculate(double a, double b, double c, double d) {

        return a * (b + (c / d));
    }

    public static boolean isCorrectAmount(int a, int b) {
       int amount = a + b;
        return amount >= 10 && amount <= 20;
    }

    public static String isPositiveOrNegativeNumber(int a) {
        if(a >= 0)
            return "Положительное число";

        return "Отрицательное число";
    }

    public static boolean isNegativeNumber(int a) {

        return a < 0;
    }

    public static String getName(String name) {
        return "Привет, " + name + "!";
    }

    public static String isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)  {
            return "Високосный год";
        }

        return "Невисокосный год";
    }

}
