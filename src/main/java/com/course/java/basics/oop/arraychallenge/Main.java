package com.course.java.basics.oop.arraychallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] numbers = getIntegers(5);
//        printArray(numbers);
//        numbers = sortIntegers(numbers);
//        printArray(numbers);

        System.out.println("Enter count: ");

        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        System.out.println("Minimum value in the array is: " + findMin(array));


    }

    private static int[] getIntegers(int n) {

        System.out.println("Type in 5 different numbers: \r");

        int[] numbers = new int[n];

        for (int i=0; i < numbers.length; i++){

            numbers[i] = scanner.nextInt();

        }
        return numbers;
    }

    private static int[] sortIntegers (int[] numbers) {

        int[] copy = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < numbers.length; i++){
            copy[i] = numbers[i];
        }

        boolean flag  = true;
        int temp;
        while (flag) {

            flag = false;
            for (int i = 0; i < copy.length-1; i++) {
                if (copy[i] < copy[i+1]) {
                    temp = copy[i];
                    copy[i] = copy[i+1];
                    copy[i+1] = temp;
                    flag = true;
                }
            }
        }
        return copy;
    }

    private static void printArray (int[] a) {
        for (int i = 0; i < a.length;i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] readIntegers(int count) {



        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter value #" + (i+1));
            array[i] = scanner.nextInt();
            scanner.nextLine();

        }
        return array;
    }
    private static int findMin (int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
