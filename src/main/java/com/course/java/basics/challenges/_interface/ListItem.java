package com.course.java.basics.challenges._interface;

public abstract class ListItem {

    private Object value;
    private ListItem previousItem;
    private ListItem nextItem;

    public ListItem (Object value) {

        this.value = value;
    }

    public Object getValue () { return this.value; }

    public boolean hasNext () { return this.nextItem != null; }

    public boolean hasPrevious () { return this.previousItem != null; }

    public void setPreviousItem (ListItem previousItem) { this.previousItem = previousItem; }

    public void setNextItem (ListItem nextItem) { this.nextItem = nextItem; }

    public ListItem getNextItem () { return this.nextItem; }

    public ListItem getPreviousItem () { return this.previousItem; }

    public ListItem next () { return nextItem; }

    public ListItem previous () { return previousItem; }

}
