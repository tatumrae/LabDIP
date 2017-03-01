package dip.lab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tatum Thomas
 */
public class RandomMessageInput implements MessagingInput{
    String[] messages = {
        "So what if, instead of thinking about solving your whole life, you just think about adding additional good things. One at a time. Just let your pile of good things grow.",
        "What would you like to do if money were no object? How would you really enjoy spending your life?",
        "Better to have a short life that is full of what you like doing than a long life spent in a miserable way."
    };

    @Override
    public String inputMessage() {
        return messages[createRandomNumber()];       
    }
    
    private final int createRandomNumber() {
        int randomNumber = new Random().nextInt(messages.length);
        return randomNumber;
    }
}
