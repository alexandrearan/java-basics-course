package com.course.java.basics.challenges.sets;

public class Star extends HeavenlyBody {

    public Star (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        if(satellite.getBodyType() != BodyTypes.STAR)
            return super.addSatellite(satellite);

        return false;
    }
}
