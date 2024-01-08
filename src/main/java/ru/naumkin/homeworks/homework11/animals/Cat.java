package ru.naumkin.homeworks.homework11.animals;

public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
        wasteOfEnduranceForSwimming = 0;
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return -1;
    }

}
