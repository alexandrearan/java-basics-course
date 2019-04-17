package com.course.java.basics.oop.genericschallenge;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;

    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int played = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team (String name) {

        this.name = name;
    }

    public String getName () {

        return name;
    }

    public boolean addPlayer (T player) {

        if(members.contains(player)) {
            System.out.println(player.getName() + " already in the team " + this.name );
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore) {

        String message;
        if(ourScore > theirScore) {
            message = " beat ";
            won++;
        } else if(ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }

        played++;

        if (opponent != null) {
            opponent.matchResults(null, theirScore, ourScore);
            System.out.println(this.name + message + opponent.getName());
        }


    }

    public int numPlayers () {
        return this.members.size();
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo (Team<T> team) {

        if (team.ranking() > this.ranking()) {
            return 1;
        }
        else if(team.ranking() < this.ranking()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
