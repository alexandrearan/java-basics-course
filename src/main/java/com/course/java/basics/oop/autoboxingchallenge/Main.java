package com.course.java.basics.oop.autoboxingchallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static Bank bank = new Bank("Java Bank");

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {

            int option = printMainMenu();

            switch(option) {

                default:
                    printMainMenu();
                    break;
                case 1:
                    showBranchList();
                    break;
                case 2:
                    createBrunch();
                    break;
                case 3:
                    selectBranch();
                    break;


            }

        }

    }
    public static int printMainMenu () {
        System.out.println("*****************************");
        System.out.println("\t(1) Show Branches List");
        System.out.println("\t(2) Create Branch CONFLICT NEW");
        System.out.println("\t(3) Select Branch");
        System.out.println("*****************************");
        System.out.println("Select an option: ");
        return scanner.nextInt();
    }


}
