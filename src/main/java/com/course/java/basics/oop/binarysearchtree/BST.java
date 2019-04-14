package com.course.java.basics.oop.binarysearchtree;

public class BST {

    private Node root;

    private static final int WHITESPACES = 8;

    public void add (int value) {

        this.root = addNode(this.root, value);
    }

    public Node getRoot () {

        return root;
    }

    private Node addNode (Node root, int value) {

        if (root == null) {
            this.root = new Node(value);
            return this.root;
        }

        if (value < root.getValue()) {
            root.setLeftChild(addNode(root.getLeftChild(), value));
        } else if (value > root.getValue()) {
            root.setRightChild(addNode(root.getRightChild(), value));
        } else {
            System.out.println("Duplicates are not allowed.");
        }
        return root;

    }

    public static void postOrder (Node node) {

        if(node == null) { return; }

        postOrder(node.getLeftChild());
        postOrder(node.getRightChild());
        visit(node);
    }

    public static void preOrder (Node node) {

        if(node == null) { return; }

        visit(node);
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
    }

    public static void inOrder (Node node) {

        if(node == null) { return; }

        inOrder(node.getLeftChild());
        visit(node);
        inOrder(node.getRightChild());
    }

    private static void visit (Node node) {

        System.out.println(node.getValue());
    }

    // code to print tree's structure
    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += WHITESPACES;

        // Process right child first
        print2DUtil(root.getRightChild(), space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = WHITESPACES; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getValue() + "\n");

        // Process left child
        print2DUtil(root.getLeftChild(), space);
    }

    // Wrapper over print2DUtil()
    public static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}