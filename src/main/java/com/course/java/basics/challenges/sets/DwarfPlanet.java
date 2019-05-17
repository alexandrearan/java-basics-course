package com.course.java.basics.challenges.sets;

public class DwarfPlanet extends HeavenlyBody {

    public DwarfPlanet (String name, int orbitalPeriod) {

        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite (HeavenlyBody satellite) {

        if(satellite.getBodyType() == BodyTypes.MOON)
            return super.addSatellite(satellite);
        System.out.println("Only BodyTypes.MOON Object can be satellite to a planet");
        return false;
    }
}
