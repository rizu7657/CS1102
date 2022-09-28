package Unit3;

import javax.swing.*;
import java.awt.*;

/**
 * A class that repeats prompting the user for an answer
 * on a quiz until a value is given.
 */
public class Quiz {
    // Create score counters
    public static int nQuestions = 0;
    public static int nCorrect = 0;

    public static void main(String[] args) {
        // Construct the question and answers
        String question1 = "What is the recipe for dark matter?\n";
        question1 += "A. 2 quarks sezium and 1 bottle water.\n";
        question1 += "B. 3 quarks sezium and 1 bottle blood.\n";
        question1 += "C. 1 quarks sezium and 1 liter fluoride.\n";
        question1 += "D. We don't know.\n";
        question1 += "E. 1 bottle water and 2 quarks palladium.\n";

        String question2 = "How fast is the speed of light?\n";
        question2 += "A. 2 000 000 m/s.\n";
        question2 += "B. 700 089 km/s.\n";
        question2 += "C. 55 000 f/s.\n";
        question2 += "D. 888 000 miles/s.\n";
        question2 += "E. 299 792 458 m/s.\n";

        String question3 = "When was old Disney Pinocchio film released?\n";
        question3 += "A. 2005\n";
        question3 += "B. 1940\n";
        question3 += "C. 1996\n";
        question3 += "D. 2002\n";
        question3 += "E. 1959\n";

        // Ask questions and check answers
        check(question1, "D");
        check(question2, "E");
        check(question3, "B");

        // Display score result
        JOptionPane.showMessageDialog(null, String.format("%d correct out of %d questions.", nCorrect, nQuestions));
    }

    /**
     * A method that asks the user for input between A-E.
     *
     * @param question String
     * @return String character
     */
    static String ask(String question) {
        // Prompt the user for input
        String answer = JOptionPane.showInputDialog(question).toUpperCase();

        while (!answer.matches("[A-E]")) {
            JOptionPane.showMessageDialog((Component)null, "Invalid answer. Please enter A, B, C, D, or E.");
            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
        return answer;
    }

    static void check(String question, String correctAnswer) {
        String answer = ask(question);
        nQuestions++;

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog((Component)null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog((Component)null, String.format("Incorrect. The answer is %s.", correctAnswer));
        }
    }
}
