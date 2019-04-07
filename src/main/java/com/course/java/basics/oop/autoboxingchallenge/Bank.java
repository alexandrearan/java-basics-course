package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {

        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch (String name) {

        for(Branch branch : branches) {
            if(branch.getName().equals(name)) {
                return false;
            }
        }
        branches.add(new Branch(name));
        return true;
    }


    public Branch getBranch(String name) {

        for (Branch branch : branches) {

            if(branch.getName().equals(name)) {

                return branch;
            }
        }
        return null;
    }
}
