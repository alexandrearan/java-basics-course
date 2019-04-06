package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, Double value) {
        this.name = name;
        if (value != 0) {
            this.addTransaction(value);
        }
    }

    public String getName() {
        return name;
    }


    public Customer (String name) {
        this(name, 0.00);
    }

    public void addTransaction (Double value) {

        this.transactions.add(value);
    }

    public ArrayList<Double> getTransactions () {

        return this.transactions;
    }
}
