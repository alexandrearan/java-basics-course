package com.course.java.basics.oop.arraylistchallenge;

import java.util.Scanner;

public class MobilePhone {


    public static Scanner scanner = new Scanner(System.in);
    public static ContactList contactList = new ContactList();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {

            int option = printMenu();

            switch(option) {
                default:
                    printMenu();
                    break;
                case 2:
                    contactList.showContactList();
                    break;
                case 3:
                    contactList.addContact();
                    break;
                case 4:
                    contactList.editContact();
                    break;
                case 5:
                    contactList.removeContact();
                    break;
                case 6:
                    contactList.searchContact();
                    break;
                case 7:
                    quit = true;
                    break;


            }
        }
    }

    public static int printMenu () {
        System.out.println("*****************************");
        System.out.println("\t(1) Show Menu");
        System.out.println("\t(2) Show Contact List");
        System.out.println("\t(3) Create New Contact");
        System.out.println("\t(4) Edit Contact");
        System.out.println("\t(5) Remove Contact");
        System.out.println("\t(6) Search Contact");
        System.out.println("*****************************");
        System.out.println("Select an option: ");
        return scanner.nextInt();
    }
}
