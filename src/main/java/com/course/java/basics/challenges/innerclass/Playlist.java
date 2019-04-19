package com.course.java.basics.challenges.innerclass;

import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Song> songList;

    public Playlist(String name) {
        this.name = name;
        this.songList = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongList() {
        return songList;
    }

    public boolean addSong (Album album, String songName) {

        Song song = album.searchSong(songName);
        if (song != null) {
            songList.add(song);
            return true;
        }

        System.out.println("Song " + songName + " doers not exist in the album " + album.getName());
        return false;
    }
}
