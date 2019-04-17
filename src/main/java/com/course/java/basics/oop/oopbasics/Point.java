package com.course.java.basics.oop.oopbasics;

public class Point {

    private int x;
    private int y;

    public Point () {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return this.distance(0,0);
    }
    public double distance(int x, int y) {

        double diffX = Math.abs(this.x - x);
        double diffY = Math.abs(this.y - y);

        return Math.sqrt(diffX*diffX + diffY*diffY);
    }

    public double distance (Point point) {

        return distance(point.getX(), point.getY());
    }

}
