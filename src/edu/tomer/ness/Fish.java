package edu.tomer.ness;

/**
 * Created by Dev on 14/03/2016.
 */
public class Fish {
    String color;
    String type;
    String lastFeedingTime;
    String name;
    int age;

    public Fish(String name, String color, String type, String lastFeedingTime, int age) {
        this.color = color;
        this.type = type;
        this.lastFeedingTime = lastFeedingTime;
        this.name = name;
        this.age = age;
    }


    void feed(String lastFeedingTime){
        this.lastFeedingTime = lastFeedingTime;
        System.out.println(name + " Eating...");
    }
}
