package ru.naumkin.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of positive elements: " + sumOfPositiveElements(createArrayAndPrint(2, 3, false)) + "\n");

        printSquare(4);
        System.out.println();

        System.out.println("Max element: " + findMax(createArrayAndPrint(4, 4, false)) + "\n");

        zeroDiagonalElements(createArrayAndPrint(10, 10, true));

        System.out.println(sumElementsOfSecondRow(createArrayAndPrint(1, 3, true)));
        int[][] arr2 = {
                {1, 2, 3},
        };
        System.out.println(sumElementsOfSecondRow(arr2));
    }


    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonalElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - 1 - i] = 0;
        }

        System.out.println("Диагонали из нулей:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumElementsOfSecondRow(int[][] array) {
        int sum = 0;
        if (array.length > 1) {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
            System.out.print("Сумма элементов 2 строки массива:");
            return sum;
        }

        System.out.print("В программе нету второй строки , метод возвращает в таком случае значение ");
        return -1;
    }


    public static int[][] createArrayAndPrint(int row, int columns, boolean isOnlyPositiveElements) {
        int[][] array = new int[row][columns];
        Random random = new Random();

        if (isOnlyPositiveElements) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(10);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(10) - 10;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }
}
