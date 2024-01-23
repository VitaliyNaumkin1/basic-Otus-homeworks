package ru.naumkin.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 50);
        Cat cat2 = new Cat("Cat2", 90);
        Plate plate1 = new Plate(40);
        Plate plate2 = new Plate(160);

        cat1.eat(plate1);
        plate1.info();
        cat2.eat(plate1);
        plate1.info();
        plate1.addFood(15);
        plate1.info();
        plate1.addFood(15);
        plate1.info();
        cat1.info();
        cat2.info();

        Cat[] cats = {
                new Cat("Cat2", 90),
                new Cat("Cat3", 20),
                new Cat("Cat4", 40),
                new Cat("Cat5", 10),
        };

        for (Cat c : cats) {
            c.eat(plate2);
        }
        for (Cat c : cats) {
            c.info();
        }
        plate2.info();
    }
}

