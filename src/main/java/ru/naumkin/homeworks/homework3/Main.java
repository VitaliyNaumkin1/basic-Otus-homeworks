package ru.naumkin.homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        greeting();
        checkSign(-4, 4, 3);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(4, 6, false);
    }

    public static void greeting() {
        System.out.println("Hello\n" + "World" + "from\n" + "Java\n");

    }


    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;

        if (sum >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }

    }

    public static void selectColor() {
        int data = (int) (Math.random() * 100);

        if (data <= 10) {
            System.out.println("Красный");
        }

        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }

        if (data > 20) {
            System.out.println("Зеленый");
        }

        System.out.println();


    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);


        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

        System.out.println();

    }


    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println("initValue + delta = " + (initValue + delta));
        } else {
            System.out.println("initValue - delta = " + (initValue - delta));
        }
    }

}