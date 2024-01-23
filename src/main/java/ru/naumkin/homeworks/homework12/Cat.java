package ru.naumkin.homeworks.homework12;

public class Cat {
    private final String name;
    private final int maxAppetite;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = false;
        this.maxAppetite = 100;

        if (appetite > 100) {
            this.appetite = 100;
        } else if (appetite < 0) {
            this.appetite = 0;
        } else {
            this.appetite = appetite;
        }
    }

    public void eat(Plate plate) {
        int remainingAppetite = maxAppetite - appetite;
        if (plate.decreaseFood(remainingAppetite)) {
            appetite = maxAppetite;
            satiety = true;
            System.out.println(name + " покушал из тарелки");
            return;
        }
        System.out.println("Слишком мало еды в тарелке для " + name);
    }

    public void info() {
        System.out.println("Информация о " + name + ": ");
        if (satiety) {
            System.out.println("Кот сыт");
        } else {
            System.out.println("Кот не сыт");
        }
    }
}
