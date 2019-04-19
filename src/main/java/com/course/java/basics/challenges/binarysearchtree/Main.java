package com.course.java.basics.challenges.binarysearchtree;

public class Main {

    public static void main (String[] args) {
        BST tree = new BST();

        tree.add(20);

        tree.add(10);
        tree.add(5);
        tree.add(7);

        tree.add(25);
        tree.add(24);
        tree.add(35);

//        for (int i = 20; i < 40; i++) {
//
//            tree.add((int)(Math.random()*40));
//        }

        tree.postOrder(tree.getRoot());

        tree.print2D(tree.getRoot());

    }
}
