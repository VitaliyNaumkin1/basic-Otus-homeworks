package ru.naumkin.homeworks.homework12;

public class Plate {
    private final int maxAmountFood;
    private int currentAmountFood;

    public Plate(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.currentAmountFood = maxAmountFood;
    }

    public void addFood(int amountFood) {
        if (amountFood < 0) {
            System.out.println("Нельзя добавить отрицательное количество еды");
            return;
        }
        if (currentAmountFood == maxAmountFood) {
            System.out.println("Тарелка и так заполнена на максимум");
            return;
        }
        if (currentAmountFood + amountFood >= maxAmountFood) {
            currentAmountFood = maxAmountFood;
            System.out.println("Вы заполнили тарелку полностью");
            return;
        }
        currentAmountFood += amountFood;
        System.out.println("Вы добавили еды в тарелку,но она не заполнена на максимум");
    }

    public boolean decreaseFood(int amount) {
        if (currentAmountFood - amount == 0) {
            currentAmountFood = 0;
            System.out.println("Еды на тарелке не осталось");
            return false;
        }
        if (currentAmountFood - amount < 0) {
            System.out.println("Еды в тарелке не хватает для полной сытости ,кот не будет есть");
            return false;
        }
        currentAmountFood -= amount;
        return true;
    }

    public void info() {
        System.out.println("Plate: " + currentAmountFood + " кол-во еды");
    }
}
