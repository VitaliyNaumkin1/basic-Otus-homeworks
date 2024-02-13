package ru.naumkin.homeworks.homework17.bubleSort;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] array = {4, 5, 10, 3, 1, 8, 2, 7, 6, 9};
        bubbleSort(array);
    }

    public static int[] bubbleSort(int[] array) {
        int exchange;
        boolean replacements;
        for (int i = 0; i < array.length; i++) {
            replacements = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    exchange = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = exchange;
                    replacements = true;
                }
            }
            if (!replacements) {
                continue;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

}
