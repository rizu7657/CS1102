package Unit5;

import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
    // Constructor method
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
}
