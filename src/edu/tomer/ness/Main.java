package edu.tomer.ness;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = r.nextInt(44);
            System.out.println(rand);
        }
    }
}
