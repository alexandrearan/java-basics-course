package com.course.java.basics.oop.polymorphism;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
        System.out.println(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public String plot () {
        return "No plot here.";
    }
}

