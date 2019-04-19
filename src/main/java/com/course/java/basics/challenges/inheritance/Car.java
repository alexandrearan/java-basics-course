package com.course.java.basics.challenges.inheritance;

public class Car extends Vehicle {

    private int doors;
    private int bootSize;
    private boolean airbag;
    private boolean abs;
    private int gear;

    public Car(double engine, String model, int doors, int bootSize, boolean airbag, boolean abs, int gear) {

        this(engine, "", model, doors, bootSize, airbag, abs, gear);
    }

    public Car(double engine, String color, String model, int doors, int bootSize, boolean airbag, boolean abs, int gear) {

        this(engine, color, model, 0, doors, bootSize, airbag, abs, gear);
    }

    public Car(double engine, String color, String model, int speed, int doors, int bootSize, boolean airbag, boolean abs, int gear) {

        super(engine, color, model, speed);

        this.doors = doors < 2 ? 2 : doors;
        this.bootSize = bootSize < 0 ? 0 : bootSize;
        this.airbag = airbag;
        this.abs = abs;

        if(gear  < -1)
            this.gear = -1;
        else if(gear > 10)
            this.gear = 10;
        else
            this.gear = gear;

    }
}
