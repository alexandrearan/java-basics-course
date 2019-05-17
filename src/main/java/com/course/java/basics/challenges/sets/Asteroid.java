package com.course.java.basics.challenges.sets;

public class Asteroid extends HeavenlyBody {

    public Asteroid (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.ASTEROID);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        System.out.println("You can't add satellites to asteroids");
        return false;
    }
}
