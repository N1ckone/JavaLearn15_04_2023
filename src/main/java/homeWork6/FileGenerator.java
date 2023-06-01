package homeWork6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

//1. Сгенерировать текстовый файл большого размера(100 мб). Произвольные символы и цифры.
//   Скопировать его с помощью различных потоков ввода и вывода
public class FileGenerator {
    public static void main(String[] args) {
    FileGenerator fileGenerator = new FileGenerator();
    int size = 1024 * 1024 * 100;
    System.out.println("Введите путь к файлу: ");
    Scanner scanner = new Scanner(System.in);
    String path = scanner.nextLine();
    fileGenerator.generateFile(size, path);
    System.out.println("Введите путь к файлу 2 для копирования: ");
    String path2 = scanner.nextLine();
    scanner.close();
    fileGenerator.copyFileWithFileWriter(path, path2);
    fileGenerator.copyFileWithBufferedFileWriter(path, path2);
    fileGenerator.copyFileWithFileInputStream(path, path2);
    fileGenerator.copyFileWithBufferedFileWriter(path, path2);

    /**
     * Вот такой вывод у меня на компьютере получился:
     *copyFileWithFileWriter: копирование завершено за 350 милисекунд
     * copyFileWithBufferedFileWriter: копирование завершено за 188 милисекунд
     * copyFileWithFileInputStream: копирование завершено за 766 милисекунд
     * copyFileWithBufferedFileWriter: копирование завершено за 207 милисекунд */
    }

    public void generateFile(int size, String path){
        Random random = new Random();
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) random.nextInt(48, 90);
        }
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))) {
            bos.write(bytes);
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Файл успешно сгенерирован !");
    }

    public void copyFileWithFileWriter(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try(FileReader reader = new FileReader(fromPath);
        FileWriter writer = new FileWriter(toPath)) {
          char[] buff = new char[1024];
          int charsRead;
          while((charsRead = reader.read(buff)) != -1) {
              writer.write(buff,0, charsRead);
          }
          writer.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();

        System.out.println("copyFileWithFileWriter: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }
    public void copyFileWithBufferedFileWriter(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try(BufferedReader reader = new BufferedReader(new FileReader(fromPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(toPath))) {
            char[] buff = new char[1024];
            int charsRead;
            while((charsRead = reader.read(buff)) != -1) {
                writer.write(buff,0, charsRead);
            }
            writer.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();

        System.out.println("copyFileWithBufferedFileWriter: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }
    public void copyFileWithFileInputStream(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream(fromPath);
        FileOutputStream fos = new FileOutputStream(toPath)) {
            byte[] buff = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(buff)) != -1) {
                fos.write(buff, 0, bytesRead);
            }
            fos.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();

        System.out.println("copyFileWithFileInputStream: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }
    public void copyFileWithBufferedInputStream(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fromPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(toPath))) {
            byte[] buff = new byte[1024];
            int bytesRead;
            while((bytesRead = bis.read(buff)) != -1) {
                bos.write(buff, 0, bytesRead);
            }
            bos.flush();
        }catch (IOException e)  {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();

        System.out.println("copyFileWithBufferedInputStream: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }

}