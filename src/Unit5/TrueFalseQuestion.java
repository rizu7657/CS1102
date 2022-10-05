package Unit5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrueFalseQuestion extends Question {
    ArrayList<String> isTrue = new ArrayList<>(Arrays.asList("t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"));
    ArrayList<String> isFalse = new ArrayList<>(Arrays.asList("f", "false", "False", "FALSE", "n", "no", "No","NO"));
    String answer;

    TrueFalseQuestion(){
        this("True is only True when False is False or not True?","True");
    }

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or False: " + question;

        if (isTrue.contains(answer)) {
            this.answer = answer;
        } else if (isFalse.contains(answer)) {
            this.answer = answer;
        } else {
            throw new IllegalArgumentException("Answer must be TRUE or FALSE");
        }

    }
    @Override
    String ask() {
        // Prompt the user for input
        String answer = JOptionPane.showInputDialog(question).toUpperCase();
        ArrayList<String> answers = (ArrayList<String>) Stream.of(isTrue, isFalse)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        while (!answers.contains(answer)) {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            answer = JOptionPane.showInputDialog(question).toUpperCase();
        }
        if (isTrue.contains(answer)) {
            answer = "TRUE";
        } else if (isFalse.contains(answer)) {
            answer = "False";
        }
        return answer;
    }
}
