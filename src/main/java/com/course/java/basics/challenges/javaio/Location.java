package com.course.java.basics.challenges.javaio;

import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

public class Location {

    @Getter
    private final int locationID;

    @Getter
    private final String description;

    private final Map<String, Integer> exits;

    public Location (int locationID, String description, Map<String, Integer> exits) {

        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new LinkedHashMap<String, Integer>(exits);
        } else {
            this.exits = new LinkedHashMap<String, Integer>();
        }

        this.exits.put("Q", 0);
    }

    public void addExit (String direction, int location) {
        exits.put(direction, location);
    }

    public Map<String, Integer> getExits () {
        return new LinkedHashMap<String, Integer>(exits);
    }
}
