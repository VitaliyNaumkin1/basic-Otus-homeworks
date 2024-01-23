package ru.naumkin.homeworks.homework13;


public class Horse implements Transport {
    private int energy;
    private Human driver;

    public Horse(int energy) {
        this.energy = energy;
        this.driver = null;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }


    @Override
    public void decreaseAmountOfResourceForMovement(int distance) {
        energy -= distance;
    }


    @Override
    public boolean movement(int distance, Terrain terrain) {
        String transportName = getClass().getSimpleName();
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может передвигаться по этому типу местности");
            return false;
        }

        if (driver == null) {
            if (energy >= distance) {
                System.out.println(transportName + " в одиночку без водителя,прошла дистанцию  длиной " + distance + ", тип местности: " + terrain.getRusName());
                decreaseAmountOfResourceForMovement(distance);
                return true;
            }
            System.out.println(transportName + " в одиночку без водителя,не прошла дистанцию длиной " + distance + ",тип местности: " + terrain.getRusName());
            decreaseAmountOfResourceForMovement(distance);
            return false;
        }

        if (energy >= distance) {
            System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",прошел дистанцию длиной " + distance + ", тип местности: " + terrain.getRusName());
            decreaseAmountOfResourceForMovement(distance);
            return true;
        }
        System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",не прошел дистанцию длиной " + distance + ",тип местности: " + terrain.getRusName());
        decreaseAmountOfResourceForMovement(distance);
        return false;
    }
}
