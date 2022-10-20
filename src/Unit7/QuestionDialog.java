package Unit7;

import javax.swing.*;
import java.awt.event.*;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;

    @Override
    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }
}
