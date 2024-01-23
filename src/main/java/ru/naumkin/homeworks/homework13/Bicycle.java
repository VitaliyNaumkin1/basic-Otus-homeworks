package ru.naumkin.homeworks.homework13;


public class Bicycle implements Transport {
    private Human driver;

    public Bicycle() {
        this.driver = null;
    }


    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public void decreaseAmountOfResourceForMovement(int distance) {
        driver.decreaseAmountOfResourceForMovement(distance);
    }

    @Override
    public boolean movement(int distance, Terrain terrain) {
        String transportName = getClass().getSimpleName();
        if (driver == null) {
            System.out.println(transportName + " не может передвигаться без водителя");
            return false;
        }

        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может передвигаться по этому типу местности");
            return false;
        }
        if (driver.getEnergy() >= distance) {
            System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",прошел дистанцию длиной " + distance + ", тип местности: " + terrain.getRusName());
            decreaseAmountOfResourceForMovement(distance);
            return true;
        }
        System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",не прошел дистанцию длиной " + distance + ",тип местности: " + terrain.getRusName());
        decreaseAmountOfResourceForMovement(distance);
        return false;
    }
}
