package ru.naumkin.homeworks.homework13;


public class AllTerrainVehicle implements Transport {
    private int petrol;
    private Human driver;

    public AllTerrainVehicle(int petrol) {
        this.petrol = petrol;
        this.driver = null;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public void decreaseAmountOfResourceForMovement(int distance) {
        petrol -= distance;
    }

    @Override
    public boolean movement(int distance, Terrain terrain) {
        String transportName = getClass().getSimpleName();
        if (driver == null) {
            System.out.println(transportName + " не может передвигаться без водителя");
            return false;
        }

        if (petrol >= distance) {
            System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",прошел дистанцию длиной " + distance + ", тип местности: " + terrain.getRusName());
            decreaseAmountOfResourceForMovement(distance);
            return true;
        }
        System.out.println("Транспортное средство - " + transportName + ", управляющий транспортным средством " + driver.getName() + ",не прошел дистанцию длиной " + distance + ",тип местности: " + terrain.getRusName());
        decreaseAmountOfResourceForMovement(distance);
        return false;
    }
}
