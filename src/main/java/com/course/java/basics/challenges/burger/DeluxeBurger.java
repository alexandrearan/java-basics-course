package com.course.java.basics.challenges.burger;

public class DeluxeBurger extends Burger {

    private Addition softdrink;
    private Addition fries;

    public DeluxeBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
        this.softdrink = new SoftDrink();
        this.fries = new Fries();
    }

    @Override
    public void addAddition(Addition addition) {
        System.out.println("Not allowed to add in Deluxe Burger");
    }

    @Override
    public String getAdditionList() {
        String additionList = super.getAdditionList();
        additionList += " + soft drink: " + this.softdrink.getPrice();
        additionList += " + fries: " + this.fries.getPrice();
        return additionList;

    }
}
