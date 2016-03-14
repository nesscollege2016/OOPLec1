package edu.tomer.ness;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] ans1 = {"4", "2", "3", "11"};
        TriviaQuestion q1 = new TriviaQuestion("1 + 1 ?", ans1, 2);

        int score = 0;

        String[] ans2 = {"פרנס", "פערסקי", "פירסון", "כל התשובות נכונות"};
        TriviaQuestion q2 = new TriviaQuestion("מה היה שמו הקודם של שמעון פרס?", ans2, 2);

        String[] ans3 = {"מרץ", "מאי", "דצמבר", "פברואר"};
        TriviaQuestion q3 = new TriviaQuestion("באיזה חודש פורח אירוס הנגב?", ans3, 1);

        TriviaQuestion[] deck = new TriviaQuestion[4];
        deck[0] = q1;
        deck[1] = q2;
        deck[2] = q3;
        deck[3]  = new TriviaQuestion("2 + 3", new String[]{"1, 5, 3, 4"}, 2);

        for (TriviaQuestion q : deck) {
            q.show();
            q.showAnswers();
            System.out.println("הזן תשובה");

            if(q.testAnswer(scan.nextInt())){
                score += 10;
            }
        }

        System.out.println("תודה ששיחקת תוצאתך "   + score);
    }
}
