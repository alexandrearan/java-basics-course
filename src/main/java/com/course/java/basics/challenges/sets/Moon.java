package com.course.java.basics.challenges.sets;

public class Moon extends HeavenlyBody {

    public Moon (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        if(satellite.getBodyType() == BodyTypes.COMET || satellite.getBodyType() == BodyTypes.ASTEROID )
            return super.addSatellite(satellite);

        return false;
    }
}
