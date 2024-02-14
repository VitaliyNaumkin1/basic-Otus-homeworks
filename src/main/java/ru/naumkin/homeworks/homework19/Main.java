package ru.naumkin.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File dir = new File("files\\");
        List<File> allFiles = getListOfFilesFromDirectory(dir.getAbsolutePath());
        printListOfFilesFromDirectory(allFiles);

        String requestedFileName;
        System.out.println("Введите название файла, содержимое которого хотите вывести: ");
        do {
            requestedFileName = scanner.nextLine();
            if (checkingFileExistence(allFiles, requestedFileName)) {
                break;
            }
            System.out.println("нету файла с таким названием,введите другое название файла: ");
        } while (true);

        String requestedFilePath = dir.getAbsolutePath() + "\\" + requestedFileName;
        printFileContent(requestedFilePath);

        System.out.println("Введите тест для записи в файл : ");
        String textToFile = scanner.nextLine();
        System.out.println("textToFile: " + textToFile);
        writeInToFile(textToFile, requestedFilePath);
    }

    private static boolean checkingFileExistence(List<File> allFiles, String requestedFileName) {
        for (File f : allFiles) {
            if (f.getName().equals(requestedFileName)) {
                return true;
            }
        }
        return false;
    }


    public static List<File> getListOfFilesFromDirectory(String pathname) {
        File dir = new File(pathname);
        return Arrays.asList(Objects.requireNonNull(dir.listFiles()));
    }

    public static void printListOfFilesFromDirectory(List<File> fileList) {
        System.out.println("Список файлов: ");
        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }

    public static void printFileContent(String path) {
        System.out.println("Содержимое файла: ");
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(path))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeInToFile(String userText, String path) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path, true))) {
            byte[] buffer = userText.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
