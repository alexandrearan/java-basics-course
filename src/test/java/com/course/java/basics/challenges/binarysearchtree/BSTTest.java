package com.course.java.basics.challenges.binarysearchtree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTTest {

    private BST tree;

    @Before
    public void setUp() throws Exception {
        tree = new BST();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEmptyTree() {
        Assert.assertNull(tree.getRoot());
    }

    @Test
    public void addRootNode() {
        tree.add(1);
        Assert.assertEquals(1, tree.getRoot().getValue());
    }

    @Test
    public void addLeftChild() {
        tree.add(5);
        tree.add(1);
        Assert.assertEquals(1, tree.getRoot().getLeftChild().getValue());
    }

    @Test
    public void addRightChild() {
        tree.add(5);
        tree.add(10);
        Assert.assertEquals(10, tree.getRoot().getRightChild().getValue());
    }

    @Test
    public void addNegativeValues() {
        tree.add(6);
        tree.add(-5);
        tree.add(4);
        Assert.assertNull(tree.getRoot().getRightChild());
        Assert.assertEquals(-5, tree.getRoot().getLeftChild().getValue());
        Assert.assertEquals(4, tree.getRoot().getLeftChild().getRightChild().getValue());
    }
}