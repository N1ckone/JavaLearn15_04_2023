package homeWork4.Emulator;

/** Написать эмулятор, который будет с случайной частотой вызвывать этот метод, до тех пор пока не превышен лимит
 * Используя паттерн Декоратор
 *  */
public class Main {
    public static void main(String[] args) {
        Printable printable = new PrinterLimitDecorator(new Emulator());
        printable.execute("Привет");

        printable.execute("Пока");
    }
}
