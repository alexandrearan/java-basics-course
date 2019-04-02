package com.course.java.basics.oop.burger;

public class Main {

    public static void main(String[] args) {

        Burger b = new Burger("Bill Burger", "seeded bun", "quarter pounder", 13.40);

        b.addIngredient(new Tomato());
        b.addIngredient(new Pickle());

        System.out.println(b.getName() + ": " + b.getBasePrice());
        System.out.println(b.getIngredientList());
        System.out.println( "Total: "+ b.getTotalPrice());
        System.out.println("\n");

        HealthyBurger b2 = new HealthyBurger("Healthy Burger", "quarter pounder", 13.40);

        b2.addIngredient(new Linseed());

        b2.addIngredient(new Tomato());
        b2.addIngredient(new Pickle());

        System.out.println(b2.getName() + ": " + b2.getBasePrice());
        System.out.println(b2.getIngredientList());
        System.out.println( "Total: "+ b2.getTotalPrice());





    }
}
