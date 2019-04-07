package com.course.java.basics.oop.autoboxingchallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Java Bank");
    private static Branch selectedBranch = null;

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {

            int option = printMainMenu();
            scanner.nextLine();

            switch(option) {

                default:
                    printMainMenu();
                    break;
                case 1:
                    showBranchList();
                    break;
                case 2:
                    createBranch();
                    break;
                case 3:
                    selectBranch();
                    break;
                case 4: quit = true;
                break;
            }
        }
    }
    public static int printMainMenu () {

        System.out.println("*****************************");
        System.out.println("\t(1) Show Branches List");
        System.out.println("\t(2) Create Branch");
        System.out.println("\t(3) Select Branch");
        System.out.println("\t(4) Quit");

        System.out.println("*****************************");
        System.out.println("Select an option: ");
        return scanner.nextInt();
    }

    public static int printBranchMenu () {

        System.out.println("**********  " + selectedBranch.getName() + "  **********");
        System.out.println("\t(1) Show Customers List");
        System.out.println("\t(2) Add Customer");
        System.out.println("\t(3) Add Transaction");
        System.out.println("\t(4) Show Transaction");
        System.out.println("\t(5) Back to Main Menu");
        System.out.println("*****************************");
        System.out.println("Select an option: ");
        return scanner.nextInt();
    }

    private static void showBranchList () {

        for(Branch branch : bank.getBranches()) {
            System.out.println(branch.getName());
        }
    }

    private static void createBranch () {

        System.out.println("Enter Brunch Name: ");
        String name = scanner.nextLine();
        if (bank.addBranch(name)) {

            System.out.println("Branch " + name  + " created successfully");
        }
        else {

            System.out.println("Branch name already exists");
        }
    }

    private static void selectBranch () {

        System.out.println("Enter Branch Name: ");

        selectedBranch = branchExists(scanner.nextLine());

        if (selectedBranch != null) {

            boolean quit = false;

            while (!quit) {

                int option = printBranchMenu();
                scanner.nextLine();
                switch(option) {

                    case 1:
                        showCustomersList();
                        break;

                    case 2:
                        addCustomer();
                        break;

                    case 3:
                        addTransaction();
                        break;

                    case 4:
                        showTransactions();
                        break;
                    case 5:
                        quit = true;
                        return;
                }
            }
        }


        System.out.println("Branch not found");

    }

    private static void showCustomersList() {

        System.out.println("----------- Branch " + selectedBranch.getName() + " customers list: ");
        for(Customer customer : selectedBranch.getCustomers()) {

            System.out.println(customer.getName());
        }

    }

    private static void addCustomer() {

        System.out.println("Please enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter an initial transaction, or 0 for no transaction");
        double value = scanner.nextDouble();

        scanner.nextLine();
        selectedBranch.addCustomer(name, value);

    }

    private static void addTransaction() {

        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter transaction value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        if(selectedBranch.getCustomer(name) != null) {

            selectedBranch.getCustomer(name).addTransaction(value);
        }
        else {

            System.out.println("Customer "  + name + " does not exist in this branch, " +
                               " would you like to create a new customer called " + name + "? ");
            System.out.println("\t (Y)es");
            System.out.println("\t (N)o");

            String option = scanner.nextLine();
            if (option.toLowerCase().equals("y")) {

                selectedBranch.addCustomer(name, value);
            }
        }
    }
    private static void showTransactions () {

        System.out.println("Enter Customer Name: ");
        String name = scanner.nextLine();

        Customer customer = selectedBranch.getCustomer(name);
        if (customer != null) {

            System.out.println("-------------------");
            System.out.println(customer.getName());

            for (Double transaction : customer.getTransactions()) {

                System.out.println(transaction);
            }
            System.out.println("-------------------");

        }
        else {

            System.out.println("Customer " + name + " does not exist in " + selectedBranch.getName());
        }

    }
    private static Branch branchExists (String name) {

        for (Branch branch : bank.getBranches()) {

            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
}
