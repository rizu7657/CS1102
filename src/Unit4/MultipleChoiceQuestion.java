package Unit4;

import javax.swing.JOptionPane;
import java.awt.*;

public class MultipleChoiceQuestion {
    // Create score counters
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    MultipleChoiceQuestion(String query, String a, String b, String
            c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        correctAnswer = answer.toUpperCase();
    }

    /**
     * A method that asks the user for input between A-E.
     *
     * @param question String
     * @return String character
     */
    String ask() {
        // Prompt the user for input
        String answer = JOptionPane.showInputDialog(question).toUpperCase();

        while (!answer.matches("[A-E]")) {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
        return answer;
    }

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
}
