package com.course.java.basics.challenges.sets;

public class Comet extends HeavenlyBody {

    public Comet (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.COMET);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        System.out.println("You can't add satellites to comets");
        return false;
    }
}
