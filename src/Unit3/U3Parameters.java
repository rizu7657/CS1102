package Unit3;

import javax.swing.*;

public class U3Parameters {

    public static void main(String[] args) {

        String actualParameter = JOptionPane.showInputDialog("Type a message to send into outer space");

        method(actualParameter);
    }

    /**
     * This method is only used to demonstrate when and how the formal parameter is used to utilize the value passed
     * from the actual parameter or argument.
     * @param formalParameter
     */
    private static void method(String formalParameter) {
        System.out.println("The value passed from the actual parameter / argument through the formal parameter is: " +
                formalParameter);
    }
}
