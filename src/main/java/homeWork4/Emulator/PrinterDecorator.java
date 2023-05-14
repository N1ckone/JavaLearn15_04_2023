package homeWork4.Emulator;

public abstract class PrinterDecorator implements Printable {
    private Printable printable;

    public PrinterDecorator(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print(String message) {
        printable.print(message);
    }

    @Override
    public void execute(String message) {
        printable.execute(message);
    }
}
