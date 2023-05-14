package homeWork4;

import java.text.NumberFormat;
import java.util.Locale;

/*** 6)
        Напишите программу, которая принимает на вход число и выводит его в денежном формате.
        Например, если на вход подается число 1234567.89, то программа должна вывести строку "$1,234,567.89".
        Используйте класс Formatter для форматирования числа и задайте соответствующий шаблон для вывода в денежном формате.
 */

public class MoneyFormatter {
    public static void main(String[] args) {
        format(12546984.50); //$12,546,984.50
    }

    public static void format(double num) {
        String format = NumberFormat.getCurrencyInstance(Locale.US).format(num);
        System.out.println(format);
    }
}
