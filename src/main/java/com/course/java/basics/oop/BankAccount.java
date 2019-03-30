package com.course.java.basics.oop;

public class BankAccount {

    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount () {
        System.out.println("Constructor");
    }

    public BankAccount(int number, double balance, String name, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit (double value) {

        if (value > 0) {
            this.balance += value;
        }
        else {
            return false;
        }
        return true;
    }

    public boolean withdrawal (double value) {

        if(this.balance - value < 0) {
            return false;
        }
        else {
            this.balance -= value;
            return true;
        }
    }
}
