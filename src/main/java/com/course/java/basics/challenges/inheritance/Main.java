package com.course.java.basics.challenges.inheritance;

import com.course.java.basics.challenges.inheritance.shape.Cylinder;

public class Main {

    public static void main(String[] args) {
//        Porsche p = new Porsche(4.0, "Carrera", 2, 200, true, true, 6, 17, false);
//
//        System.out.println(p.getWheelSize());
//        System.out.println(p.getModel());


        Cylinder c = new Cylinder(4, 12);
        System.out.println(c.getHeight());
    }
}