package ru.naumkin.homeworks.homework11.animals;

public class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        wasteOfEnduranceForSwimming = 2;
    }
}
