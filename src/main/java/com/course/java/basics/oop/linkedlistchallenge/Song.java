package com.course.java.basics.oop.linkedlistchallenge;

public class Song {

    private String name;
    private String duration;

    public Song(String name, String duration) {

        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public static Song createSong (String name, String duration) {
        return new Song(name, duration);
    }
}
