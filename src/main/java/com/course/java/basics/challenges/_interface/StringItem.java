package com.course.java.basics.challenges._interface;

public class StringItem extends ListItem {

    private String value;

    public StringItem (String value) {

        super(value);
        this.value = value;
    }

    public String getValue () { return this.value; }

    public StringItem (Object value) {

        super(value);
    }

    @Override
    public StringItem getNextItem () { return (StringItem)super.getNextItem(); }

    @Override
    public StringItem getPreviousItem () { return (StringItem)super.getPreviousItem(); }

    public int compareTo (StringItem item) { return item.getValue().compareTo(this.value); }
}
