package com.course.java.basics.challenges.linkedlist;

import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Song> songList;

    public Album(String name) {
        this.name = name;
        this.songList = songList = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public boolean addSong (String name, String duration) {


        if (!findSong(name)) {
            songList.add(new Song(name, duration));

            System.out.println("Song " + name + " added to the album " + this.name);
            System.out.println("---------------------");
            return true;
        }
        else {
            System.out.println("Song " + name + " already exists in the album " + this.name);
            return false;
        }
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public Song searchSong(String name) {

        for (Song song : songList) {

            if (song.getName().toLowerCase().equals(name.toLowerCase())) {
                return song;
            }
        }
        return null;
    }

    private boolean findSong(String name) {

        for (Song song  : songList) {

            if (song.getName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
