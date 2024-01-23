package ru.naumkin.homeworks.homework13;


public class Human {
    private final String name;

    private int energy;
    private Transport currentTransport;

    public Human(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }


    public void decreaseAmountOfResourceForMovement(int distance) {
        energy -= distance;
    }

    public void getInTheTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println("Человек уже находится на траспорте");
            return;
        }
        currentTransport = transport;
        currentTransport.setDriver(this);
    }

    public void getOffTheTransport() {
        if (currentTransport == null) {
            System.out.println(name + " и так без транспортного средства");
            return;
        }
        currentTransport.setDriver(null);
        currentTransport = null;
    }

    public boolean moving(int distance, Terrain terrain) {
        if (currentTransport == null) {
            if (energy >= distance) {
                System.out.println("Человек" + name + "пешком прошел дистанцию " + distance);
                return true;
            } else {
                System.out.println("Человеку" + name + "не хватило энергии пройти всю дистанцию " + distance);
                return false;
            }
        }

        return currentTransport.movement(distance, terrain);
    }
}

