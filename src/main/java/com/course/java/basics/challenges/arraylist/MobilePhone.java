package com.course.java.basics.challenges.arraylist;

import java.util.Scanner;

public class MobilePhone {


    public static Scanner scanner = new Scanner(System.in);
    public static ContactList contactList = new ContactList();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {

            int option = printMenu();
            scanner.nextLine();

            switch(option) {
                default:
                    printMenu();
                    break;
                case 2:
                    contactList.showContactList();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    editContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
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

    public static void addContact () {

        System.out.println("Enter Contact Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Contact Phone Number: ");
        String number = scanner.nextLine();

        contactList.addContact(name, number);

    }

    public static void editContact () {

        System.out.println("Enter name to edit contact: ");
        String name = scanner.nextLine();

        Contact contact = contactList.searchContact(name);

        if(contact != null) {

            System.out.println(contact.getName() + " : " + contact.getNumber());

            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.println("Enter new number: ");
            String newNumber = scanner.nextLine();

            contactList.editContact(name, newName, newNumber);

        }
        else {
            System.out.println("Contact not found");
        }
    }

    public static void removeContact () {

        System.out.println("Enter name to edit contact: ");
        String name = scanner.nextLine();

        Contact contact = contactList.searchContact(name);

        if(contact != null) {
            System.out.println("deleting " + contact.getName() + "...");
            contactList.removeContact(name);
        }
        else {
            System.out.println(name + " not found in contact list");
        }
    }
    public static void searchContact() {

        System.out.println("Search contact: ");
        String name = scanner.nextLine();

        Contact contact = contactList.searchContact(name);

        if(contact != null) {
            System.out.println(contact.getName() + ": "  + contact.getNumber());
        }
        else {
            System.out.println(name + " not found!");
        }
    }
}
