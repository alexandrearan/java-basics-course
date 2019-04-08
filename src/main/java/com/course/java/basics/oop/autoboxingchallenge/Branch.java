package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Branch  {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer (String customerName, double value) {

        for (Customer customer : customers) {
            if (customerName.equals(customer.getName())){
                return false;
            }
        }
        this.customers.add(new Customer (customerName, value));
        return true;
    }

    public Customer getCustomer (String name) {

        for (Customer customer : customers) {

            if(customer.getName().equals(name)) {

                return customer;
            }
        }
        return null;
    }
}
