package com.course.java.basics.composition.house;

public class Mattress {

    private String brand;
    private boolean springs;

    public Mattress(String brand, boolean springs) {
        this.brand = brand;
        this.springs = springs;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isSprings() {
        return springs;
    }
}
