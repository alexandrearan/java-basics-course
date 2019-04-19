package com.course.java.basics.challenges.composition;

public class Bed extends Furniture {

    private boolean bunkBed;
    private Mattress mattress;

    public Bed(int width, int height, int length, String material, boolean bunkBed, Mattress mattress) {
        super(width, height, length, material);
        this.bunkBed = bunkBed;
        this.mattress = mattress;
    }

    public boolean isBunkBed() {
        return bunkBed;
    }

    public Mattress getMattress() {
        return mattress;
    }
}
