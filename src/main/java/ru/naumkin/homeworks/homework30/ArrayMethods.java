package ru.naumkin.homeworks.homework30;

public class ArrayMethods {

    public int[] getArrayWithElementsAfterLastNumberOne(int[] array) {
        int indexOfLastNumberOne = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                indexOfLastNumberOne = i;
            }
        }
        if (indexOfLastNumberOne == -1) {
            throw new RuntimeException();
        }
        int sizeForNewArray = array.length - indexOfLastNumberOne - 1;
        int[] newArray = new int[sizeForNewArray];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[sizeForNewArray + 1 + i];
        }

        return newArray;
    }

    public boolean isArrayFilledWithTwoNumbers(int[] array) {
        boolean isNumber_1_Exist = false;
        boolean isNumber_2_Exist = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 2) {
                System.out.println(1);
                return false;
            }

            if (array[i] == 1) {
                isNumber_1_Exist = true;
            }

            if (array[i] == 2) {
                isNumber_2_Exist = true;
            }
        }

        if (!isNumber_1_Exist || !isNumber_2_Exist) {
            System.out.println(1);
            return false;
        }

        System.out.println(3);
        return true;
    }
}

