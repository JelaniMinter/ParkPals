package org.launchcode.ParkPals.models;

public enum DogTemperament {
    REACTIVE("Reactive"),
    SELECTIVE("Selective"),
    FRIENDLY("Friendly");

    private final String temperamentType;

    DogTemperament(String temperamentType) {
        this.temperamentType = temperamentType;
    }

    public String getTemperamentType() {
        return temperamentType;
    }
}