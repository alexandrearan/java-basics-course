package com.course.java.basics.oop.autoboxingchallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {

        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch (String branchName) {

        for(Branch branch : branches) {
            if(branch.getName().equals(branchName)) {
                return false;
            }
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public Branch getBranch(String branchName) {

        for (Branch branch : branches) {

            if(branch.getName().equals(branchName)) {

                return branch;
            }
        }
        return null;
    }
}
