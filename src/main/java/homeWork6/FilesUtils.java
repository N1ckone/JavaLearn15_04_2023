package homeWork6;

import java.io.*;
import java.util.Random;

public class FilesUtils {
    public static void generateFile(int size, String path) {
        Random random = new Random();
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) random.nextInt(48, 90);
        }
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))) {
            bos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Файл успешно сгенерирован !");
    }

    public static void copyFileWithFileWriter(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try (FileReader reader = new FileReader(fromPath);
             FileWriter writer = new FileWriter(toPath)) {
            char[] buff = new char[1024];
            int charsRead;
            while ((charsRead = reader.read(buff)) != -1) {
                writer.write(buff, 0, charsRead);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("copyFileWithFileWriter: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }

    public static void copyFileWithBufferedFileWriter(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(fromPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(toPath))) {
            char[] buff = new char[1024];
            int charsRead;
            while ((charsRead = reader.read(buff)) != -1) {
                writer.write(buff, 0, charsRead);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("copyFileWithBufferedFileWriter: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }

    public static void copyFileWithFileInputStream(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(fromPath);
             FileOutputStream fos = new FileOutputStream(toPath)) {
            byte[] buff = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buff)) != -1) {
                fos.write(buff, 0, bytesRead);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("copyFileWithFileInputStream: копирование завершено за " + (finishTime - startTime) + " милисекунд");
    }

    public static void copyFileWithBufferedInputStream(String fromPath, String toPath) {
        long startTime = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fromPath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(toPath))) {
            byte[] buff = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buff)) != -1) {
                bos.write(buff, 0, bytesRead);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("copyFileWithBufferedInputStream: копирование завершено за " + (finishTime - startTime) + " милисекунд");
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
