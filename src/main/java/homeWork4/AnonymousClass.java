package homeWork4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class AnonymousClass {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                return 0;
            }
        };
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setVisible(true);


        Graphics g = panel.getGraphics();
        try {
            printable.print(g, new PageFormat(), 10);
        } catch (PrinterException e) {
            throw new RuntimeException(e);
        }
    }
}
