package com.course.java.basics.challenges.shoppingbasket;

/**
 * Created by dev on 16/02/2016.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock = 0;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityAvailable () {
        return quantityInStock - reserved;
    }
    public int quantityReserved () {
        return reserved;
    }

    public int reserveStock(int quantity) {
        if(quantity >=0 && quantity <= quantityInStock - reserved) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock (int quantity) {
        if(quantity >= 0 && quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock (int quantity) {

        if(quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >=0) {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ":\tprice " + String.format("%.2f", this.price);
    }
}
