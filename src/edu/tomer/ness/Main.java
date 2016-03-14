package edu.tomer.ness;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] answers = {"4", "2", "3", "11"};
        TriviaQuestion q1 = new TriviaQuestion("1 + 1 ?", answers, 2);

        q1.show();
        q1.showAnswers();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the correct Answer: ");
        int ans = scan.nextInt();
        q1.testAnswer(ans);
    }
}
