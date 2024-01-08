package ru.naumkin.homeworks.homework11.animals;

public class Horse extends Animal {
    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        wasteOfEnduranceForSwimming = 4;
    }
}
