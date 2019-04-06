package com.course.java.basics.oop.arraylistchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private static Scanner scanner = new Scanner(System.in);

    public void addContact () {

        System.out.println("Enter Contact Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Contact Phone Number: ");
        String number = scanner.nextLine();

        addContact(name, number);

    }
    private Contact addContact (String name, String number) {

        if(!contacts.contains(name) || !contacts.contains(number)) {
            Contact contact = new Contact(name, number);
            contacts.add(contact);
            return contact;
        }

        return null;

    }

    public void editContact () {

        System.out.println("Enter name to edit contact: ");
        String name = scanner.nextLine();

        Contact contact = this.searchContact(name);

        if(contact != null) {

            System.out.println(contact.getName() + " : " + contact.getNumber());

            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.println("Enter new number: ");
            String newNumber = scanner.nextLine();

            editContact(name, newName, newNumber);

        }
        else {
            System.out.println("Contact not found");
        }
    }

    private boolean editContact (String name, String newName, String newNumber) {

        Contact contact = this.searchContact(name);

        if (contact != null) {

            contact.setName(newName);
            contact.setNumber(newNumber);
            return true;
        }
        return false;
    }

    public void removeContact () {

        System.out.println("Enter name to edit contact: ");
        String name = scanner.nextLine();

        Contact contact = this.searchContact(name);

        if(contact != null) {
            System.out.println("deleting " + contact.getName() + "...");
            removeContact(name);
        }
        else {
            System.out.println(name + " not found in contact list");
        }

    }

    private Contact removeContact (String name) {

        Contact contact = this.searchContact(name);

        if (contact != null) {
            this.contacts.remove(contact);
            return contact;
        }

        return null;
    }

    public void searchContact() {
        System.out.println("Search contact: ");
        String name = scanner.nextLine();

        Contact contact = searchContact(name);

        if(contact != null) {
            System.out.println(contact.getName() + ": "  + contact.getNumber());
        }
        else {
            System.out.println(name + " not found!");
        }
    }

    private Contact searchContact (String name) {

        for (Contact contact : contacts) {
            if(contact.getName().equals(name))
                return contact;
        }xx
        return null;
    }

    public void showContactList () {

        System.out.println("------------------------------------------");
        System.out.println("Contacts: ");
        for (int i = 0; i < this.contacts.size(); i++){

            System.out.println(i+1 + ". " + this.contacts.get(i).getName() + " - " + this.contacts.get(i).getNumber());

        }
        System.out.println("------------------------------------------");
    }
}
