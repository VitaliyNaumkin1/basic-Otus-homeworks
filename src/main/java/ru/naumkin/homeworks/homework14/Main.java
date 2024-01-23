package ru.naumkin.homeworks.homework14;


import ru.naumkin.homeworks.homework14.exceptions.AppArrayDataException;
import ru.naumkin.homeworks.homework14.exceptions.AppArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = new String[1][4];
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3ffff", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        int sumArrayElements;
        try {
            sumArrayElements = convertArrayStringElementsToIntAndSum(array2);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e.getMessage());
            System.out.println("Подан не корректный массив, сумма элементов высчитываться не будет");
            return;
        }
        System.out.println("Сумма элементов массива: " + sumArrayElements);
    }


    public static int convertArrayStringElementsToIntAndSum(String[][] array) throws RuntimeException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Не корректный массив, массив должен быть размером 4х4 ");
        }

        int parsedNumber;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                parsedNumber = parseStringToInt(array[i][j], i, j);
                sum += parsedNumber;
            }
        }
        return sum;
    }

    public static int parseStringToInt(String string, int i, int j) {
        if (string.matches("\\d+")) {
            return Integer.parseInt(string);
        } else {
            throw new AppArrayDataException(string, i, j);
        }
    }
}
