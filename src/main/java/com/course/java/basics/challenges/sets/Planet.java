package com.course.java.basics.challenges.sets;

public class Planet extends HeavenlyBody {

    public Planet (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        if(satellite.getBodyType() == BodyTypes.MOON)
            return super.addSatellite(satellite);

        System.out.println("Only BodyTypes.MOON Object can be satellite to a planet");
        return false;
    }
}
