package dip.lab3;

/**
 *
 * @author Tatum Thomas
 */
public class MessagingService {
    private MessagingInput input;
    private MessagingOutput output;

    public MessagingService(MessagingInput input, MessagingOutput output) {
        setInput(input);
        setOutput(output);
    }
    
    public final void createMessage() {
        String message = input.gatherInputMessage();
        
    }

    public final MessagingInput getInput() {
        return input;
    }

    public final void setInput(MessagingInput input) {
        this.input = input;
    }

    public final MessagingOutput getOutput() {
        return output;
    }

    public final void setOutput(MessagingOutput output) {
        this.output = output;
    }
    
    
}
