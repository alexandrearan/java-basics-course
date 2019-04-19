package com.course.java.basics.challenges._interface;

import java.util.List;

public interface ISaveable {

    List<String> write ();
    void read (List<String> savedValues);

}
