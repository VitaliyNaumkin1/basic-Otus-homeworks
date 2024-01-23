package ru.naumkin.homeworks.homework13;


public interface Transport {
    boolean movement(int distance, Terrain terrain);

    void setDriver(Human driver);

    void decreaseAmountOfResourceForMovement(int distance);


}
