package edu.tomer.ness;

/**
 * Define the user Template.
 * A new type that we define
 */
public class User {
    //Properties:
    String name;
    String lastName;
    String id;//0371232133
    String phone;//050-48458588
    int age;

    //methods:
    void sayHello(){
        System.out.println("Hello");
    }

    void sayYourName(){
        System.out.println(name +" " + lastName);
    }

    void saySomething(String someThing){
        System.out.println(someThing);
    }

    void doYouLikeThisColor(String color){
        if (color.equals("Black"))
            System.out.println("Hell, Yeah!");
        else
            System.out.println("Not so much");
    }
}
