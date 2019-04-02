package com.course.java.basics.oop.inheritance;

public class Porsche extends Car {

    private int wheelSize;
    private boolean convertible;

    public Porsche(double engine, String model, int doors, int bootSize, boolean airbag, boolean abs, int gear, int wheelSize, boolean convertible) {

        this(engine, "", model, 0, doors, bootSize, airbag, abs, gear, wheelSize, convertible);
    }

    public Porsche(double engine, String color, String model, int doors, int bootSize, boolean airbag, boolean abs, int gear, int wheelSize, boolean convertible) {

        this(engine, color, model, 0, doors, bootSize, airbag, abs, gear, wheelSize, convertible);
    }

    public Porsche(double engine, String color, String model, int speed, int doors, int bootSize, boolean airbag, boolean abs, int gear, int wheelSize, boolean convertible) {

        super(engine, color, model, speed, doors, bootSize, airbag, abs, gear);
        this.wheelSize = wheelSize;
        this.convertible = convertible;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}