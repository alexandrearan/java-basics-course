package com.course.java.basics.composition.house;

public class Wardrobe extends Furniture {

    private int numberOfDoors;
    private int numberOfDrawers;

    public Wardrobe(int width, int height, int length, String material, int numberOfDoors, int numberOfDrawers) {
        super(width, height, length, material);
        this.numberOfDoors = numberOfDoors;
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }
}
