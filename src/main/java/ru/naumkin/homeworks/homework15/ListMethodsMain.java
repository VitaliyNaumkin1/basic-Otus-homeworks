package ru.naumkin.homeworks.homework15;


import java.util.ArrayList;
import java.util.List;

public class ListMethodsMain {
    public static void main(String[] args) {
        List<Integer> list = fillListWithValuesFromMinToMax(-1, 10);
        System.out.println(list);
        System.out.println("_______________________________________________");
        int sumElements = sumElementsIfTheyGreaterThanFive(list);
        System.out.println("sumElements: " + sumElements);
        System.out.println("_______________________________________________");
        List<Integer> list1 = fillListWithValuesFromMinToMax(0, 10);
        System.out.println(list1);
        List<Integer> list2 = replaceListElementsWithSpecificValue(5, list1);
        System.out.println(list2);
        System.out.println("_______________________________________________");
        List<Integer> test = fillListWithValuesFromMinToMax(0, 10);
        System.out.println(test);
        List<Integer> tes2 = increaseAllElementsByCertainValue(5, test);
        System.out.println(tes2);
        System.out.println("_______________________________________________");
    }

    public static List<Integer> fillListWithValuesFromMinToMax(int min, int max) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerList.add(i);
        }
        return integerList;
    }

    public static int sumElementsIfTheyGreaterThanFive(List<Integer> integerList) {
        int sum = 0;
        if (integerList.isEmpty()) {
            return sum;
        }

        for (Integer value : integerList) {
            if (value > 5) sum += value;
        }
        return sum;
    }

    public static List<Integer> replaceListElementsWithSpecificValue(int number, List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, number);
        }
        return integerList;
    }

    public static List<Integer> increaseAllElementsByCertainValue(int number, List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) + number);
        }
        return integerList;
    }

}
