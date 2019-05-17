package com.course.java.basics.challenges.javaio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Locations locations = new Locations();
    private static final Map<String, String> ALLOWED_DIRECTIONS = new HashMap<>();

    public static void main (String[] args) {

        ALLOWED_DIRECTIONS.put("NORTH", "N");
        ALLOWED_DIRECTIONS.put("SOUTH", "S");
        ALLOWED_DIRECTIONS.put("WEST", "W");
        ALLOWED_DIRECTIONS.put("EAST", "E");

        ALLOWED_DIRECTIONS.put("N", "N");
        ALLOWED_DIRECTIONS.put("S", "S");
        ALLOWED_DIRECTIONS.put("W", "W");
        ALLOWED_DIRECTIONS.put("E", "E");

        Scanner scanner = new Scanner (System.in);

        int loc = 77;

        while (true) {

            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.println("Exits available are: ");

            for (String exit : exits.keySet()) {

                System.out.print(exit + ", ");
            }

            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            String[] phrase = direction.split(" ");

            for (String word : phrase) {

                if(ALLOWED_DIRECTIONS.containsKey(word)) {

                    direction = ALLOWED_DIRECTIONS.get(word);
                    break;
                }
            }

            if (exits.containsKey(direction)) {

                loc = exits.get(direction);
                System.out.println("location: " + loc);

            } else {

                System.out.println("you can not go in that direction");
            }
        }
    }
}
