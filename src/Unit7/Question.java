package Unit7;

import javax.swing.*;
import java.awt.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;

    QuestionDialog question;
    String correctAnswer;

    Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
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

    String ask() {
        question.setVisible(true);
        return question.answer;
    }
}
