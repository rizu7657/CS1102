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
        int lives = 5;
        do {
            System.out.println("Lives left: " + lives);
            lives--;
        } while (lives != 0);
        System.out.println("Game over!\n");

        lives = 5;
        while (lives != 0) {
            System.out.println("Lives left: " + lives);
            lives--;
        }
        System.out.println("Game over!\n");

        for (lives = 5; lives == 0; lives--) {
            System.out.println("Lives left: " + lives);
        }

        // For with an equivalent while and do-while loop
        String[] fruits = {"apple", "orange", "banana"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int index = 0;
        while (index != (fruits.length)) {
            System.out.println("Fruit: " + fruits[index]);
            index++;
        }

        index = 0;
        do {
            System.out.println("Fruit: " + fruits[index]);
            index++;
        } while (index != (fruits.length));
    }
}
