package com.course.java.basics.challenges.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private static Scanner scanner = new Scanner(System.in);


    public Contact addContact (String name, String number) {

        if(!contacts.contains(name) || !contacts.contains(number)) {
            Contact contact = new Contact(name, number);
            contacts.add(contact);
            return contact;
        }

        return null;

    }

    public boolean editContact (String name, String newName, String newNumber) {

        Contact contact = this.searchContact(name);

        if (contact != null) {

            if(searchContact(newName) != null){

                System.out.println("Contact name " + newName + " Already exists. Contact not updated.");
            }
            else {

                contact.setName(newName);
                contact.setNumber(newNumber);
                return true;
            }
        }
        return false;
    }

    public Contact removeContact (String name) {

        Contact contact = this.searchContact(name);

        if (contact != null) {
            this.contacts.remove(contact);
            return contact;
        }

        return null;
    }

    public Contact searchContact (String name) {

        for (Contact contact : contacts) {
            if(contact.getName().equals(name))
                return contact;
        }
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
