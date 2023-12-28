package ru.naumkin.homeworks.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 6, 9, 8,};
        int[] array1 = {8, 7, 6, 5, 4, 3, 2, 22};
        int[] array2 = {2, 11, 1, 8, 13, 23, 16, 7, 9};

        printString(5, "hello");
        sumElementsOfArrayAndPrint(array);
        fillArray(5, array);
        increaseArrayElement(10, array);
        compareHalvesOfTheArrayAndPrint(array1);

        sumOfArrays(new int[]{1, 6, 9, 8, 0, 1},
                new int[]{8, 7, 6, 5, 4, 3, 2, 22},
                new int[]{2, 11, 1, 8, 13, 23, 16, 7, 9});

        ascendingOrDescendingArray(new int[]{1, 2, 3, 4, 5, 6});
        flipTheArray(new int[]{1, 2, 3, 4, 5, 6});
        flipTheArray2(new int[]{1, 2, 3, 4, 5, 6});

    }

    public static void printString(int amount, String str) {
        for (int i = 0; i < amount; i++) {
            System.out.println(str);
        }

        System.out.println();

    }

    public static void sumElementsOfArrayAndPrint(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }

        System.out.println("summ = " + sum + "\n");


    }

    public static void fillArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }

        System.out.println(Arrays.toString(arr) + "\n");

    }

    public static void increaseArrayElement(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }

        System.out.println(Arrays.toString(arr) + "\n");

    }

    public static void compareHalvesOfTheArrayAndPrint(int[] arr) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        if (sum1 > sum2) {
            System.out.println("Сумма левой части массива больше" + "\n");
        } else {
            System.out.println("Сумма правой части массива больше" + "\n");
        }

    }


    public static void sumOfArrays(int[]... arrays) {
        int[] sumOfArrays;
        int maxLength = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) {
                maxLength = arrays[i].length;
            }
        }
        sumOfArrays = new int[maxLength];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sumOfArrays[j] += arrays[i][j];
            }
        }

        System.out.println(Arrays.toString(sumOfArrays) + "\n");

    }


    public static void ascendingOrDescendingArray(int[] arr) {
        System.out.print("Выберете какая будет проверка массива: \n 1 - на возрастание " +
                "\n 2 - на убывание \n Введите цифру: ");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("В этом массиве не все элементы идут в порядке возрастания");
                    return;
                }
            }

            System.out.println("В этом массиве  все элементы идут в порядке возрастания");

        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("В этом массиве не все элементы идут в порядке убывания");
                    return;
                }
            }

            System.out.println("В этом массиве  все элементы идут в порядке убывания");

        }

    }

    public static void flipTheArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int exchange = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = exchange;
        }

        System.out.println(Arrays.toString(arr) + "\n");

    }

    public static void flipTheArray2(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int exchange = arr[j];
            arr[j] = arr[i];
            arr[i] = exchange;
        }

        System.out.println(Arrays.toString(arr) + "\n");

    }


}