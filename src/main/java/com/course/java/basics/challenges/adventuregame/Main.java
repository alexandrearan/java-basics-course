package com.course.java.basics.challenges.adventuregame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();
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

        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("W", 2);
        tempMap.put("E", 3);
        tempMap.put("S", 4);
        tempMap.put("N", 5);
        locations.put(1, new Location(1, "you are sitting at the end of a road before a small brick building", tempMap));

        tempMap = new HashMap<>();
        tempMap.put("N", 5);
        locations.put(2, new Location(2, "you are at the top of a hill", tempMap));

        tempMap = new HashMap<>();
        tempMap.put("W", 1);
        locations.put(3, new Location(3, "you are inside a building, a well house for a small spring", tempMap));

        tempMap = new HashMap<>();
        tempMap.put("N", 1);
        tempMap.put("W", 2);
        locations.put(4, new Location(4, "you are in a valley beside a stream", tempMap));

        tempMap = new HashMap<>();
        tempMap.put("S", 1);
        tempMap.put("W", 2);
        locations.put(5, new Location(5, "you are in the forest", tempMap));

        tempMap = new HashMap<>();
        locations.put(0, new Location(0, "you are sitting in front of the computer learning java", tempMap));

        int loc = 1;

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

            } else {

                System.out.println("you can not go in that direction");
            }
        }
    }
}
