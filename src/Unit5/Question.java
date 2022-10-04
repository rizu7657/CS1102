package Unit5;

import javax.swing.*;
import java.awt.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    void check() {
        String answer = ask();
        nQuestions++;

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog((Component)null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog((Component)null, String.format("Incorrect. The answer is %s.", correctAnswer));
        }
    }

    static void showResults() {
        // Display score result
        JOptionPane.showMessageDialog(null, String.format("%d correct out of %d questions.", nCorrect, nQuestions));
    }

    abstract String ask();
}
