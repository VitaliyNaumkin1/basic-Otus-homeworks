package ru.naumkin.homeworks.homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.FieldPosition;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список файлов:");
        File dir = new File("files\\");
        if (!dir.exists()){
            try {
                Files.createDirectory(dir.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        printFiles(dir);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        if (!isFileExist(dir, fileName)) {
            System.out.println("Такого файла не существует");
            return;
        }
        System.out.print("Введите последовательность символов которую хотите найти в файле: ");
        String searchSequence = scanner.nextLine();
        String fileText = textFromFile(fileName);
        int count = numberOfOccurrences(fileText, searchSequence);
        System.out.println("Количество повторений введенной строки в файле: " + count);
    }

    private static void printFiles(File dir) {
        File[] files = dir.listFiles();
        assert files != null;
        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    public static boolean isFileExist(File dir, String fileName) {
        File[] files = dir.listFiles();
        if (files == null) {
            return false;
        }
        for (File f : files) {
            if (f.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }

    private static String textFromFile(String fileName) {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("files\\" + fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    public static int numberOfOccurrences(String str, String substr) {
        int occurrences = 0;
        int index = str.indexOf(substr);
        while (index != -1) {
            occurrences++;
            index = str.indexOf(substr, index + 1);
        }
        return occurrences;
    }

}