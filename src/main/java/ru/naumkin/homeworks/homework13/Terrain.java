package ru.naumkin.homeworks.homework13;

public enum Terrain {
    DENSE_FOREST("густой лес"),
    SWAMP("болото"),
    PLAIN("равнина");
    final String rusName;

    public String getRusName() {
        return rusName;
    }

    Terrain(String rusName) {
        this.rusName = rusName;
    }
}
