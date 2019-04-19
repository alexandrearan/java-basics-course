package com.course.java.basics.challenges._interface;

public class StringList {

    private StringItem head;

    public StringList () {}


    public StringItem remove (String value) {

        StringItem item = getItem(value);

        if (item == head) { //item to be removed is first on the list

            if (item.hasNext()) {

                item.getNextItem().setPreviousItem(null);
                head = item.getNextItem();

            } else {

                head = null;
            }

        } else if(item.hasNext()) {

            item.getPreviousItem().setNextItem(item.getNextItem());

        } else {

            item.getPreviousItem().setNextItem(null);
        }

        return null;
    }

    public void add (StringItem newItem) {

        if(head == null) {
            this.head = newItem;

        } else {

            checkNextItem(newItem, head);
        }
    }

    private void checkNextItem (StringItem newItem, StringItem currentItem) {

        if (newItem.compareTo(currentItem) < 0 ) {

            // newItem is greater than currentItem
            if(currentItem.hasNext()) {

                checkNextItem(newItem, currentItem.getNextItem());
            }
            else {

                currentItem.setNextItem(newItem);
                newItem.setPreviousItem(currentItem);
            }
        }
        else if (newItem.compareTo(currentItem) > 0) {

            // newItem is smaller than currentItem
            if(currentItem.hasPrevious()) {

                currentItem.getPreviousItem().setNextItem(newItem);

            } else {

                this.head = newItem;
            }

            currentItem.setPreviousItem(newItem);
            newItem.setNextItem(currentItem);

        } else {

            System.out.println("This item is a duplicate. Item not added to the linked list" );

        }
    }

    public StringItem getItem (String value) {

        if(head == null) return null;

        StringItem current = head;

        while(current.hasNext()){

            if(current.getValue().equals(value)) {
                return current;
            }
            current = current.getNextItem();
        }
        return current;
    }

    public String toString () {

        if(head == null) {
            return "List is empty";
        }
        String string = head.getValue();
        ListItem temp = head;
        while (temp.hasNext()){
            string = string + ", " + temp.getNextItem().getValue();
            temp = temp.getNextItem();
        }
        return string;
    }
}
