package homeWork6;

import java.io.File;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        int size = 1024 * 1024 * 100;
        System.out.println("Введите путь к файлу: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FilesUtils.generateFile(size, path);
        System.out.println("Введите путь к файлу 2 для копирования: ");
        String path2 = scanner.nextLine();
        FilesUtils.copyFileWithFileWriter(path, path2);
        FilesUtils.copyFileWithBufferedFileWriter(path, path2);
        FilesUtils.copyFileWithFileInputStream(path, path2);
        FilesUtils.copyFileWithBufferedInputStream(path, path2);
        System.out.println("Введите путь к картинке для копирования:");
        String pagePath = scanner.nextLine();
        System.out.println("Введите путь, куда картинку скопировать:");
        String pathToPage = scanner.nextLine();
        //FilesUtils.copyFileWithBufferedFileWriter(pagePath, pathToPage); //копирование происходит, но оно происходит некорректно:
        // файл поврежден и его невозможно открыть, кроме того вторая картинка в два раза больше весит, чем первая
        FilesUtils.copyFileWithBufferedInputStream(pagePath, pathToPage); //здесь все нормально
        System.out.println("Введите путь к дирректории для ее обхода:");
        String pathToDirectory = scanner.nextLine();
        FilesUtils.traverseFileTree(new File(pathToDirectory));
        scanner.close();
        /** На моем компьютере я получил следующие результаты:
         * copyFileWithFileWriter: копирование завершено за 526 милисекунд
         * copyFileWithBufferedFileWriter: копирование завершено за 300 милисекунд
         * copyFileWithFileInputStream: копирование завершено за 924 милисекунд
         * copyFileWithBufferedInputStream: копирование завершено за 243 милисекунд
         * Копирование через BufferedInputStream самое быстрое*/
    }
}
