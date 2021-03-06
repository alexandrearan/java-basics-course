package com.course.java.basics.challenges.polymorphism;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("movie #" + i + ": " + movie.getName());
            System.out.println("Plot: " + movie.plot());
            System.out.println("----------------------------------------");
        }

    }

    public static Movie randomMovie () {
        int randomNumber = (int)(Math.random () * 5) + 1;

        switch(randomNumber) {

            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
