package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatum Thomas
 */
public class ConsoleOutput implements MessagingOutput{

    @Override
    public final void outputMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("You must enter a message!");
        }
        System.out.println(message);
    }
}
