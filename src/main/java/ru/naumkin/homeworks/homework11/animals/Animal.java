package ru.naumkin.homeworks.homework11.animals;


public class Animal {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;
    protected boolean isTired;
    protected int wasteOfEnduranceForSwimming;


    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.endurance = endurance;
        this.isTired = false;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.wasteOfEnduranceForSwimming = 0;
    }


    public int run(int distance) {

        if (endurance == 0) {
            isTired = true;
            return -1;
        }

        if (distance > endurance) {
            System.out.println(name + " не хватило выносливости пробежать всю дистанцию " + distance + " метров " + "и появилась усталость");
            isTired = true;
            endurance = 0;
            return -1;
        }

        endurance -= distance;
        if (endurance == 0) {
            isTired = true;
        }
        int time = (int) Math.ceil((double) distance / runningSpeed);
        System.out.println(name + " хватило выносливости пробежать дистацию " + distance + " метров" + " за " + time + " секунды");
        return time;
    }


    public int swim(int distance) {

        if (endurance == 0) {
            isTired = true;
            return -1;
        }

        if ((distance * wasteOfEnduranceForSwimming) > endurance) {
            System.out.println(name + " не хватило выносливости проплыть всю дистанцию " + distance + " метров " + "и появилась усталость");
            isTired = true;
            endurance = 0;
            return -1;
        }

        endurance -= distance * wasteOfEnduranceForSwimming;
        if (endurance == 0) {
            isTired = true;
        }
        int time = (int) Math.ceil((double) distance / swimmingSpeed);
        System.out.println(name + " хватило выносливости проплыть дистацию " + distance + " метров" + " за " + time + " секунды");
        return time;
    }

    public void info() {
        if (isTired) {
            System.out.println("У " + name + " состояние усталости");
            return;
        }
        System.out.println("Выносливость(оставшиеся силы) " + name + " : " + endurance);
    }

}