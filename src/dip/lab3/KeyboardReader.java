package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Tatum Thomas
 */
public class KeyboardReader implements MessagingInput{

    @Override
    public String readLine() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your input: ");
        return keyboard.nextLine();
        
    }
    
}
