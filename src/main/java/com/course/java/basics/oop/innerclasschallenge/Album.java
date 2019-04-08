package com.course.java.basics.oop.innerclasschallenge;

import java.util.ArrayList;

public class Album {

    private String name;
    private SongList songList;

    public Album(String name) {
        this.name = name;
        this.songList = songList = new SongList();
    }

    public String getName() {
        return name;
    }

    public boolean addSong (String name, String duration) {

        return this.songList.addSong(name, duration);
    }

    public ArrayList<Song> getSongList() {
        return this.songList.getSongList();
    }

    public Song searchSong(String name) {

        for (Song song : songList.getSongList()) {

            if (song.getName().toLowerCase().equals(name.toLowerCase())) {
                return song;
            }
        }
        return null;
    }
    private class SongList {
        ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        private boolean addSong(String name, String duration) {

            if (!findSong(name)) {
                songList.add(new Song(name, duration));

                System.out.println("Song " + name + " added to the album");
                System.out.println("---------------------");
                return true;
            }
            else {
                System.out.println("Song " + name + " already exists in the album");
                return false;
            }
        }
        private boolean findSong (String name) {

            for (Song song  : songList) {

                if (song.getName().toLowerCase().equals(name.toLowerCase())){
                    return true;
                }
            }
            return false;
        }
    }
}
