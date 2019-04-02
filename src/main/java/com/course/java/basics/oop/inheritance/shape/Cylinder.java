package com.course.java.basics.oop.inheritance.shape;

//import lombok.Getter;
//import lombok.NonNull;
//
//@Getter
//public class Cylinder extends Circle {
//
//    @NonNull
//    private double height;
//
//    public Cylinder(double radius, double height) {
//        super(radius);
//        this.height = height < 0 ? 0 : radius;
//    }
//
//    public double getVolume () {
//
//        return this.height * this.getArea();
//    }
//}



public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {

        return height;
    }

    public double getVolume () {

        return this.height * this.getArea();
    }
}
