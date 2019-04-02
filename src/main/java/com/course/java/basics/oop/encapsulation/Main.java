package com.course.java.basics.oop.encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player("Alex", 50, "sword");
//
//        System.out.println("initial health is " + player.getHealth());
//
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: "+ player.healthRemaining());

        Printer p = new Printer (100, true);

        while (p.pagesLeft() >= 2) {

            p.printDuplex();
            System.out.println("toner level: " + p.getTonerLevel());
            System.out.println("pages printed: " + p.getPagesPrinted());

        }





    }
}
