package com.course.java.basics.challenges.inheritance;

public class Vehicle {

    private double engine;
    private String color;
    private String model;
    private int speed;

    public Vehicle(double engine, String model) {
        this(engine, "", model, 0);
    }

    public Vehicle(double engine, String color,String model) {
        this(engine, color, model, 0);
    }

    public Vehicle(double engine, String color, String model, int speed) {
        this.engine = engine < 0 ? 0 : engine;
        this.color = color;
        this.model = model;
        this.speed = speed  < 0 ? 0 : speed;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void setSpeed(int speed) {

        if (speed < 0)
            this.speed = 0;
        else if(speed > 200)
            this.speed = 200;
        else
            this.speed = speed;
    }

    public void accelerate (int speed) {
        this.setSpeed(speed);
    }

    public void steer(String direction) {

        switch(direction.toLowerCase()) {

            case "left" :
                System.out.println("turn left");
                break;

            case "right" :
                System.out.println("turn right");
                break;

            default :
                System.out.println("keep going");
        }
    }
}
