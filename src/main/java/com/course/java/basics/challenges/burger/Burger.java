package com.course.java.basics.challenges.burger;

public class Burger {

    private String name;
    private String rollType;
    private String meat;

    private Addition lettuce;
    private Addition tomato;
    private Addition cheese;
    private Addition pickle;

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


    public void addAddition (Addition addition) {

        switch(addition.getClass().getSimpleName())
        {
            case "Lettuce" :
                this.lettuce = addition;
                break;
            case "Cheese" :
                this.cheese = addition;
                break;
            case "Tomato" :
                this.tomato = addition;
                break;
            case "Pickle" :
                this.pickle = addition;
                break;
            default:
                System.out.println("Invalid Ingredient");
                break;

        }
        this.addPrice(addition.getPrice());

    }
    public String getAdditionList() {


        String additionList = "";

        if(this.lettuce != null)
            additionList += " + lettuce: " + this.lettuce.getPrice();
        if (this.tomato != null)
            additionList += " + tomato: " + this.tomato.getPrice();
        if (this.cheese != null)
            additionList += " + cheese: " + this.cheese.getPrice();
        if (this.pickle != null)
            additionList += " + pickle: " + this.pickle.getPrice();

        return additionList;
    }
}
