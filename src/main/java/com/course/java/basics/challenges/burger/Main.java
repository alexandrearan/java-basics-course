package com.course.java.basics.challenges.burger;

public class Main {

    public static void main(String[] args) {

        Burger b = new Burger("Bill Burger", "seeded bun", "quarter pounder", 13.40);

        b.addAddition(new Tomato());
        b.addAddition(new Pickle());

        System.out.println(b.getName() + ": " + b.getBasePrice());
        System.out.println(b.getAdditionList());
        System.out.println( "Total: "+ b.getTotalPrice());
        System.out.println("\n");

        System.out.println("***************************");

        HealthyBurger b2 = new HealthyBurger("Healthy Burger", "quarter pounder", 13.40);

        b2.addAddition(new Linseed());

        b2.addAddition(new Tomato());
        b2.addAddition(new Pickle());

        System.out.println(b2.getName() + ": " + b2.getBasePrice());
        System.out.println(b2.getAdditionList());
        System.out.println( "Total: "+ b2.getTotalPrice());

        System.out.println("***************************");


        DeluxeBurger b3 = new DeluxeBurger("Deluxe Burger", "quarter pounder", "double burger", 13.40);

        b3.addAddition(new Linseed());

        System.out.println(b2.getName() + ": " + b2.getBasePrice());
        System.out.println(b2.getAdditionList());
        System.out.println( "Total: "+ b2.getTotalPrice());







    }
}
