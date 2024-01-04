package ru.naumkin.homeworks.homework10.Box;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box(14, 10, "black");
        box.info();
        System.out.println();
        box.putItem("apple");
        box.removeItem("ball");
        box.removeItem("apple");
        box.close();
        box.putItem("ball");
        box.open();
        box.close();

        System.out.println();
        box.info();

    }
}
