package com.course.java.basics.challenges.composition;

public class Furniture {

    private int width;
    private int height;
    private int length;
    private String material;

    public Furniture(int width, int height, int length, String material) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }
}
