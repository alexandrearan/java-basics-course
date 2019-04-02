package com.course.java.basics.oop.burger;

public class Burger {

    private String name;
    private String rollType;
    private String meat;

    private Ingredient lettuce;
    private Ingredient tomato;
    private Ingredient cheese;
    private Ingredient pickle;

    private double basePrice;
    private double totalPrice;

    public Burger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = price;
        this.totalPrice = this.basePrice;
    }

    public String getName () {
        return this.name;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addPrice(double price) {
        this.totalPrice += price;
    }


    public void addIngredient (Ingredient ingredient) {

        switch(ingredient.getClass().getSimpleName())
        {
            case "Lettuce" :
                this.lettuce = ingredient;
                break;
            case "Cheese" :
                this.cheese = ingredient;
                break;
            case "Tomato" :
                this.tomato = ingredient;
                break;
            case "Pickle" :
                this.pickle = ingredient;
                break;
            default:
                System.out.println("Invalid Ingredient");
                break;

        }
        this.addPrice(ingredient.getPrice());

    }
    public String getIngredientList() {


        String ingredientList = "";

        if(this.lettuce != null)
            ingredientList += "\nlettuce: " + this.lettuce.getPrice();
        if (this.tomato != null)
            ingredientList += "\ntomato: " + this.tomato.getPrice();
        if (this.cheese != null)
            ingredientList += "\ncheese: " + this.cheese.getPrice();
        if (this.pickle != null)
            ingredientList += "\npickle: " + this.pickle.getPrice();

        return ingredientList;
    }
}
