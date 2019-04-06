package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Branch  {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer (String name, Double value) {

        for (Customer c : customers) {
            if (name.equals(c.getName())){
                return false;
            }
        }
        this.customers.add(new Customer (name, value));
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
