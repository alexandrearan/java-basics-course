package com.course.java.basics.challenges.composition;

public class Room {

    private String name;
    private boolean suiteRoom;
    private Window window;
    private Bed bed;
    private Wardrobe wardrobe;
    private BookShelf bookShelf;

    public Room(String name, boolean suiteRoom, Window window, Bed bed, Wardrobe wardrobe, BookShelf bookShelf) {
        this.name = name;
        this.suiteRoom = suiteRoom;
        this.window = window;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.bookShelf = bookShelf;
    }

    public String getName() {
        return name;
    }

    public boolean isSuiteRoom() {
        return suiteRoom;
    }

    public Window getWindow() {
        return window;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }
}
