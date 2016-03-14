package edu.tomer.ness;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Dev on 14/03/2016.
 */
public class Fish {
    String color;
    String type;
    String lastFeedingTime;
    String name;
    int age;

    public Fish(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name:");
        this.name = scan.next();

        System.out.println("Enter color:");
        this.color = scan.next();

        System.out.println("Enter type:");
        this.type = scan.next();

        Date now = new Date();
        this.lastFeedingTime = now.toString();

        System.out.println("Enter age:");
        this.age = scan.nextInt();
    }

    public Fish(String name, String color, String type, String lastFeedingTime, int age) {
        this.color = color;
        this.type = type;
        this.lastFeedingTime = lastFeedingTime;
        this.name = name;
        this.age = age;
    }


    void feed(String lastFeedingTime){
        System.out.println(this.lastFeedingTime);

        //feeding the fish:
        System.out.println(name + " Eating...");
        //update the feeding time:
        this.lastFeedingTime = lastFeedingTime;

       //print the updated feeding time:
        System.out.println(this.lastFeedingTime);
    }
}
