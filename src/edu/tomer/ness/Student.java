package edu.tomer.ness;

import java.util.Date;

/**
 * Template that defines a new Type
 */
public class Student {
     //properties / variables:
    String name;
    String profession;

    public Student(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    //actions / methods
    void dispDetails(){
        System.out.println("Name: " + name + " profession: " + profession);
    }

}
