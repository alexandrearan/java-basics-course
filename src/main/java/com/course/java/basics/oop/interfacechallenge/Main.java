package com.course.java.basics.oop.interfacechallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Player alex = new Player("Alex", 100, 200);
//        System.out.println(alex.toString());
//
//        alex.setHitPoints(80);
//        alex.setWeapon("Axe");
//        saveObject(alex);
//
//        System.out.println(alex.toString());
//
//        System.out.println("-----------------------------------");
//
//        Monster goro = new Monster("Goro", 3000, 400);
//        System.out.println(goro.toString());
//        saveObject(goro);
//
//        System.out.println(goro.toString());

        StringList stringList = new StringList();

        String items = "Johnny Balazs Trevor Yuri Alex Vanessa";
        String[] data = items.split(" ");

        for (String s  : data) {
            stringList.add(new StringItem(s));
        }

        stringList.remove("Balazs");

        System.out.println("stringList: " + stringList.toString());

    }


    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable object) {

        for (int i = 0; i < object.write().size() ; i++) {

            System.out.println("Saving " + object.write().get(i) + " to storage device");
        }
    }


    public static void loadObject (ISaveable object) {

        ArrayList<String> values = readValues();
        object.read(values);
    }

}
