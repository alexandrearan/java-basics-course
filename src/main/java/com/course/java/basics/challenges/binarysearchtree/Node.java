package com.course.java.basics.challenges.binarysearchtree;

public class Node {

    private int value;
    private Node leftChild, rightChild;


    public Node (int value) {

        this.value = value;
    }

    public int getValue () { return value; }

    public Node getLeftChild () { return leftChild; }

    public void setLeftChild (Node leftChild) { this.leftChild = leftChild; }

    public Node getRightChild () { return rightChild; }

    public void setRightChild (Node rightChild) { this.rightChild = rightChild; }
}
