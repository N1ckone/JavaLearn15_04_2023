package homeWork6;

import java.io.File;
import java.util.Scanner;


//2. Написать программу которая выводит полный список папок и подпапок в консоль, начиная с заданной директории.
// Использовать класс java.io.File и его методы
public class FileTreeTraversal {
    public static void main(String[] args) {
        System.out.println("Введите путь к папке");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        File rootDir = new File(path);
        traverseFileTree(rootDir);
    }

    public static void traverseFileTree(File root) {
        if(root.isDirectory()) {
            System.out.println("Директория: " + root.getName());
            File[] files = root.listFiles();
            if(files != null) {
                for (File file : files) {
                    traverseFileTree(file);
                }
            }
        } else {
            System.out.println("Файл: " + root.getName());
        }
    }
}
