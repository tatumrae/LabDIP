package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatum Thomas
 */
public class JOptionOutput implements MessagingOutput{

    @Override
    public void outputMessage() {
        JOptionPane.showMessageDialog(null, "text");
    }

}
