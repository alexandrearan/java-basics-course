package com.course.java.basics.oop.composition;

public class Main {

    public static void main(String[] args) {

        Room room = new Room("bedroom", true,
                    new Window(10, 20, false),
                    new Bed(20, 20, 10, "wood", false, new Mattress("Copel", true)),
                    new Wardrobe(20, 20, 20, "wood", 3, 5),
                    new BookShelf(3));

        System.out.println(room.getBed().getMattress().getBrand() + " é a marca do colchão");
    }
}
