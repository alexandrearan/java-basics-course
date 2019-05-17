package com.course.java.basics.challenges.sets;

import java.util.HashSet;
import java.util.Set;

public class StarSystem<HeavenlyBody> {

    private Set<HeavenlyBody> bodies = new HashSet<>();

    public boolean addBody (HeavenlyBody body) {

        for(HeavenlyBody b : bodies) {

            if (b.equals(body)) {
                return false;
            }
        }
        bodies.add(body);
        return true;
    }
    public Set<HeavenlyBody> getBodies () {

        return new HashSet<>(bodies);
    }
}

