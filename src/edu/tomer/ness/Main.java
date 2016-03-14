package edu.tomer.ness;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*        Date now = new Date();
        Fish nemo = new Fish("Nemo", "Orange", "Clown", now.toString(), 0);
        now = new Date();
        nemo.feed(now.toString());*/

        Date now = new Date();

        for (int i = 0; i < 1; i++) {
            Fish temp = new Fish();
            System.out.println("_______________________");
            now = new Date();
            temp.feed(now.toString());
        }

    }
}
