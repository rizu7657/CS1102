import javax.swing.*;

/**
 * A class to demonstrate examples of use of Java control structures.
 */
public class U2Loops {
    public static void main(String[] args){
        String input = "";

        // While with an equivalent do-while and for loop
        while (input == "") {
            input = JOptionPane.showInputDialog("Provide some input here: ");
        }

        input = "";
        do {
            input = JOptionPane.showInputDialog("Please provide some input: ");
        } while (input == "");

        input = "";
        for (int i = 0; i < 1;) {
            if (input == "") {
                input = JOptionPane.showInputDialog("Please provide some input: ");
            } else {
                i++;
            }
        }

        // Do-while with an equivalent while and for loop

        // For with an equivalent while and do-while loop

    }
}
