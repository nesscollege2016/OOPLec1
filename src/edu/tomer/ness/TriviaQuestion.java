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
}
