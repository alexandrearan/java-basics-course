package com.course.java.basics.oop.composition;

public class Window {

    private int width;
    private int height;
    private boolean slideWindow;

    public Window(int width, int height, boolean slideWindow) {
        this.width = width;
        this.height = height;
        this.slideWindow = slideWindow;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isSlideWindow() {
        return slideWindow;
    }
}
