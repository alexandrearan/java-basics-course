package com.course.java.basics.challenges.generics;

public class Main {

    public static void main (String[] args) {

        SoccerPlayer jon = new SoccerPlayer("Jon");
        SoccerPlayer joe = new SoccerPlayer("Joe");
        SoccerPlayer joseph = new SoccerPlayer("Joseph");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

        liverpool.addPlayer(jon);
        liverpool.addPlayer(joe);

        Team<SoccerPlayer> city = new Team<> ("Manchester City");
        Team<SoccerPlayer> barcelona = new Team<> ("Barcelona");

        city.addPlayer(joseph);

        city.matchResults(liverpool, 1, 4);
        city.matchResults(barcelona, 1, 2);
        liverpool.matchResults(barcelona, 5, 3);

        System.out.println(barcelona.getName() + ": " + barcelona.ranking());
        System.out.println(liverpool.getName() + ": " + liverpool.ranking());

        System.out.println(barcelona.compareTo(liverpool));

        League<Team<SoccerPlayer>> league = new League<>("Champion's League");

        league.addTeam(liverpool);
        league.addTeam(barcelona);
        league.addTeam(city);

        league.rankings();
    }
}
