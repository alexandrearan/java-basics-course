package com.course.java.basics.encapsulation;

public class Printer {

    private double tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean duplex;
    private double tonerPerPage = .3;

    public Printer(double tonerLevel, boolean duplex) {

        this.fillToner(tonerLevel);
        this.duplex = duplex;
    }

    public void fillToner (double tonerLevel) {

        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
    }

    public void printDuplex () {

        if (pagesLeft() < 2) {
            System.out.println("not enough toner to print, fill it up!");
        }
        else
        {
            tonerLevel -= tonerPerPage * 2;
            pagesPrinted += 2;
        }
    }

    public void printPage() {

        if (pagesLeft() < 1) {
            System.out.println("not enough toner to print, fill it up!");
        }
        else {
            tonerLevel -= tonerPerPage;
            pagesPrinted++;
            System.out.println("printPage() -> printing...");
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public double pagesLeft () {
        return Math.floor(tonerLevel / tonerPerPage);
    }

}
