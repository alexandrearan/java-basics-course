package com.course.java.basics.oop.inheritance.shape;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Circle {

    @NonNull
    private double radius;

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getArea () {

        return Math.PI * radius * radius;
    }
}
//
//
//
//
//public class Circle {
//
//    private double radius;
//
//    public Circle (double radius) {
//        this.radius = radius < 0 ? 0 : radius;
//    }
//
//    public double getRadius () {
//
//        return radius;
//    }
//
//    public double getArea () {
//
//        return Math.PI * radius * radius;
//    }
//}