package com.course.java.basics.challenges.sets;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {

        HeavenlyBody sun = new Star("Sun", 50);

        HeavenlyBody mercury    = new Planet("Mercury", 88);
        HeavenlyBody venus      = new Planet("Venus", 225);
        HeavenlyBody earth      = new Planet("Earth", 365);
        HeavenlyBody mars       = new Planet("Mars", 470);
        HeavenlyBody jupiter    = new Planet("Jupiter", 10800);
        HeavenlyBody saturn     = new Planet("Saturn", 18000);
        HeavenlyBody neptune    = new Planet("Neptune", 88);
        HeavenlyBody uranus     = new Planet("Uranus", 25000);
        HeavenlyBody pluto      = new DwarfPlanet("Pluto", 88);

        HeavenlyBody saturno2  = new Planet("Saturn", 99);


        StarSystem<HeavenlyBody> solarSystem = new StarSystem<>();

        solarSystem.addBody(sun);
        sun.addSatellite(mercury);
        sun.addSatellite(venus);
        sun.addSatellite(earth);
        sun.addSatellite(mars);
        sun.addSatellite(jupiter);
        sun.addSatellite(saturn);
        sun.addSatellite(neptune);
        sun.addSatellite(uranus);
        sun.addSatellite(pluto);


        Map<String, HeavenlyBody> map = new HashMap<>();
        map.put("mercury", mercury);

        System.out.println(map);

        HeavenlyBody moon = new Moon("Moon", 27);
        earth.addSatellite(moon);

        HeavenlyBody deimos = new Moon("Deimos", 10);
        HeavenlyBody phobos = new Moon("Phobos", 15);

        mars.addSatellite(deimos);
        mars.addSatellite(phobos);

        HeavenlyBody halley = new Comet("Halley", 84*365);
        HeavenlyBody _67p = new Asteroid("67p", 88);

        sun.addSatellite(halley);
        sun.addSatellite(_67p);


        printHeavenlyBody(sun, 0);
    }

    private static void printHeavenlyBody (HeavenlyBody body, int sub) {

        StringBuilder dash = new StringBuilder();

        for (int i = 0; i < sub; i++) {

            dash.append("\t");
        }

        System.out.print(dash + " " + body);
        System.out.println();

        if (!body.getSatellites().isEmpty()) {
            sub++;

            for (HeavenlyBody satellite : body.getSatellites()) {

                printHeavenlyBody(satellite, sub);
            }
        }
    }
}
