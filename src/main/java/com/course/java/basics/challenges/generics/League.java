package com.course.java.basics.challenges.generics;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {

    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public League (String name) { this.name = name; }

    public String getName () { return name; }

    public boolean addTeam (T team) {

        if (members.contains(team)){
            System.out.println(team.getName() + " already in " + name);
            return false;
        }
        else {
            members.add(team);
            return true;
        }
    }

    public void rankings () {

        Collections.sort(members);
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
        System.out.println("Rankings");
        System.out.println("***************************************************************");
        for (Team team : members) {
            System.out.println(team.getName() + " : " + team.ranking());
        }
        System.out.println("***************************************************************");
        System.out.println("***************************************************************");
    }
}
