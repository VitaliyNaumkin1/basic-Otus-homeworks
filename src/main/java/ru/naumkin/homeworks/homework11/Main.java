package ru.naumkin.homeworks.homework11;

import ru.naumkin.homeworks.homework11.animals.Cat;
import ru.naumkin.homeworks.homework11.animals.Dog;
import ru.naumkin.homeworks.homework11.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("kot", 2, 2, 7);
        Dog dog = new Dog("Dog", 2, 3, 12);
        Horse horse = new Horse("Horse", 5, 2, 26);
        cat.run(6);
        cat.info();
        dog.swim(6);
        dog.info();
        horse.swim(6);
        horse.info();
        horse.run(2);
        horse.info();
    }
}