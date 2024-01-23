package ru.naumkin.homeworks.homework13;


public class Main {
    public static void main(String[] args) {
        Terrain terrain = Terrain.PLAIN;
        Car car = new Car(1000);
        Bicycle bicycle = new Bicycle();
        Horse horse = new Horse(1100);
        bicycle.movement(1011,terrain);
        car.movement(10, terrain);
        horse.movement(700, terrain);

        Human human = new Human("Petya", 1600);
        human.getOffTheTransport();
        Transport[] transports = {
                new Car(1000),
                new Bicycle(),
                new AllTerrainVehicle(100000),
                new Horse(2000)
        };

        for (Transport t : transports) {
            human.getInTheTransport(t);
            human.moving(1500, terrain);
            human.getOffTheTransport();
        }
    }
}
