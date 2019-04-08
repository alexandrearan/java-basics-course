package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double value) {

        this.name = name;
        this.transactions = new ArrayList<Double>();

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

    public void addTransaction (double value) {

        this.transactions.add(value);
    }

    public ArrayList<Double> getTransactions () {

        return this.transactions;
    }
}
