package com.course.java.basics.oop.burgerchallenge;

public class HealthyBurger extends Burger {

    private Addition linseed;
    private Addition spinach;

    public HealthyBurger(String name, String meat, double price) {

        super(name, "brown rye bread", meat, price);
    }

    @Override
    public void addAddition(Addition addition) {

        switch(addition.getClass().getSimpleName()) {

            case "Linseed":
                this.linseed = addition;
                break;
            case "Spinach" :
                this.spinach  = addition;
                break;
            default:
                super.addAddition(addition);

        }
        this.addPrice(addition.getPrice());
    }

    @Override
    public String getAdditionList() {
        String additionList = super.getAdditionList();

        if (this.linseed != null)
            additionList += " + linseed: " + this.linseed.getPrice();

        if (this.spinach != null)
            additionList += " + spinach: " + this.spinach.getPrice();

        return additionList;
    }
}
