package edu.tomer.ness;

/**
 * Created by Dev on 14/03/2016.
 */
public class TriviaQuestion {
    String question;
    String[] answers;
    int correctAnswerIndex;

    public TriviaQuestion(String question, String[] answers, int correctAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    boolean testAnswer(int index){
        System.out.println(index == correctAnswerIndex ? "Great!" : "Too Bad...");
        return index == correctAnswerIndex;
    }

    void show(){
        System.out.println(question);
    }

    void showAnswers(){
        for (int i = 0; i < answers.length; i++) {
            String ans = answers[i];
            System.out.println(i + 1 +") " + ans);
        }
    }

}
