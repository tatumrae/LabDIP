package dip.lab3;

/**
 *
 * @author Tatum Thomas
 */
public class Startup {
    public static void main(String[] args) {
        MessagingInput input = new RandomMessageInput();
        MessagingOutput output = new JOptionOutput();
        
        MessagingService service = new MessagingService(input, output);
        service.createMessage();
        
    }
}
