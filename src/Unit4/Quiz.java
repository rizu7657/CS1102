package Unit4;

import javax.swing.*;

/**
 * A class that repeats prompting the user for an answer
 * on a quiz until a value is given.
 */
public class Quiz {

    public static void main(String[] args) {
        // Construct the question and answers
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "What is the recipe for dark matter?",
                "2 quarks sezium and 1 bottle water.",
                "3 quarks sezium and 1 bottle blood.",
                "1 quarks sezium and 1 liter fluoride.",
                "We don't know.",
                "1 bottle water and 2 quarks palladium.",
                "d");

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "How fast is the speed of light?",
                "2 000 000 m/s.",
                "700 089 km/s.",
                "55 000 f/s.",
                "888 000 miles/s.",
                "299 792 458 m/s.",
                "E");

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "When was old Disney Pinocchio film released?",
                "2005",
                "1940",
                "1996",
                "2002",
                "1959",
                "B");

        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
                "What is your favorite superhero character? (You might disagree)",
                "Iron Man",
                "Batman",
                "Thanos",
                "Captain America",
                "Hulk",
                "a"
        );

        // Ask questions and check answers
        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();

        // Display score result
        MultipleChoiceQuestion.showResults();
    }
}
