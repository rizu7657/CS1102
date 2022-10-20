package Unit7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TrueFalseQuestion extends Question {
    ArrayList<String> isTrue = new ArrayList<>(Arrays.asList("t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"));
    ArrayList<String> isFalse = new ArrayList<>(Arrays.asList("f", "false", "False", "FALSE", "n", "no", "No", "NO"));


    TrueFalseQuestion(String question, String answer) {
        super(question);
        JPanel buttons = new JPanel();

        // Construct dialog box
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.question.add((buttons));
        initQuestionDialog();

        if (isTrue.contains(answer)) {
            this.correctAnswer = answer;
        } else if (isFalse.contains(answer)) {
            this.correctAnswer = answer;
        } else {
            throw new IllegalArgumentException("Answer must be TRUE or FALSE");
        }

    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
