package ru.naumkin.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = false;

        if (appetite > 100) {
            this.appetite = 100;
        } else if (appetite < 0) {
            this.appetite = 0;
        } else {
            this.appetite = appetite;
        }
    }

    public void eat(Plate plate) {
        int remainingAppetite = 100 - appetite;
        if (plate.getCurrentAmountFood() < remainingAppetite) {
            System.out.println("Слишком мало еды в тарелке для " + name);
            return;
        }
        plate.decreaseFood(remainingAppetite);
        appetite = 100;
        satiety = true;
        System.out.println(name + " покушал из тарелки");
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
