package CS1102Unit2;

import javax.swing.JOptionPane;

/**
 * A class that repeats prompting the user for an answer
 * on a quiz until a value is given.
 */
public class Quiz {
    public static void main(String[] args) {
        // Construct the question and answers
        String question = "What is the recipe for dark matter?\n";
        question += "A. 2 quarks sezium and 1 bottle water.\n";
        question += "B. 3 quarks sezium and 1 bottle blood.\n";
        question += "C. 1 quarks sezium and 1 liter fluoride.\n";
        question += "D. We don't know.\n";
        question += "E. 1 bottle water and 2 quarks palladium.\n";

        // Prompt the user for input
        String answer = JOptionPane.showInputDialog(question).toUpperCase();

        while (answer != "D") {
            // Checks whether the answer is correct.
            if (answer.equals("D")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.matches("[A-E]")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }

            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
    }
}
