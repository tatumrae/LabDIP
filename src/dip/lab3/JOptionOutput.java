package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatum Thomas
 */
public class JOptionOutput implements MessagingOutput{

    @Override
    public void outputMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("You must enter a message!");
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
