package com.course.java.basics.oop.burger;

public class HealthyBurger extends Burger {

    private Ingredient linseed;
    private Ingredient spinach;

    public HealthyBurger(String name, String meat, double price) {

        super(name, "brown rye bread", meat, price);
    }

    @Override
    public void addIngredient(Ingredient ingredient) {

        switch(ingredient.getClass().getSimpleName()) {

            case "Linseed":
                this.linseed = ingredient;
                break;
            case "Spinach" :
                this.spinach  = ingredient;
                break;
            default:
                super.addIngredient(ingredient);

        }
        this.addPrice(ingredient.getPrice());
    }

    @Override
    public String getIngredientList() {
        String ingredientList = super.getIngredientList();

        if (this.linseed != null)
            ingredientList += "\nlinseed: " + this.linseed.getPrice();

        if (this.spinach != null)
            ingredientList += "\nspinach: " + this.spinach.getPrice();

        return ingredientList;
    }
}
