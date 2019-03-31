package com.course.java.basics.polymorphism;

public class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial forces try to take over the Universe";
    }
}