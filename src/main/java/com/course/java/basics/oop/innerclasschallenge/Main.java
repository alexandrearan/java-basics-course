package com.course.java.basics.oop.innerclasschallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Queen - Greatest Hits III");
        System.out.println("---------------------");
        album.addSong("Under Pressure", "4:09");
        album.addSong("Barcelona", "4:25");
        album.addSong("Killing in the name", "4:29");
        album.addSong("Too Much Love Will Kill You", "4:19");

        ArrayList<Song> songList = album.getSongList();

        System.out.println("Album: " + album.getName());

        for (Song song : songList) {

            System.out.println(song.getName() + " - " + song.getDuration());
        }

        Playlist playlist = new Playlist("My Playlist");
        addSongToPlaylist(playlist, album, "under pressure");
        addSongToPlaylist(playlist, album, "Too much love will kill you");
        addSongToPlaylist(playlist, album, "Killing in the name");



        playSong (playlist);

    }


    private static void playSong (Playlist playlist) {

        ListIterator<Song> iterator = playlist.getSongList().listIterator();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        Song current = null;

        while (!quit) {

            System.out.println("\n\nChoose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    if(!goingForward) {
                        if(iterator.hasNext()){
                            current = iterator.next();
                        }
                        goingForward = true;
                    }

                    if(iterator.hasNext()) {
                        current = iterator.next();
                        System.out.println("playing " + current.getName());
                    }
                    else  {
                        System.out.println("end of playlist");
                        goingForward = true;
                    }
                    break;

                case 2:

                    if(goingForward) {
                        if (iterator.hasPrevious()) {
                            current = iterator.previous();
                        }
                        goingForward = false;
                    }
                    if (iterator.hasPrevious()) {
                        current = iterator.previous();
                        System.out.println("playing " + current.getName());
                    }
                    else
                    {
                        System.out.println("beginning of the playlist");
                        goingForward = false;
                    }

                    break;
                case 3:

                    if(!iterator.hasNext()){
                        goingForward = true;
                    }
                    else if(!iterator.hasPrevious()) {
                        goingForward = false;
                    }
                    if(current != null) {
                        System.out.println("playing " + current.getName());
                    }
                    else {
                        current = iterator.next();
                        System.out.println("playing " + current.getName());
                        goingForward = false;
                    }
                    break;

                case 4:

                    showPlaylist(playlist);
                    break;

                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void showPlaylist(Playlist playlist) {
        LinkedList<Song> pl = playlist.getSongList();
        for(Song song : pl) {
            System.out.println(song.getName() + " - " + song.getDuration());
        }
    }

    private static void addSongToPlaylist (Playlist playlist, Album album, String songName) {

        if (playlist.addSong(album, songName)) {

            System.out.println("Song added to playlist " + playlist.getName());
        }
        else
            System.out.println("Song not added to playlist");

    }
}
