package dip.lab2.student.solution1;

/**
 *
 * @author Tatum Thomas
 */
public class Startup {
    public static void main(String[] args) {
        // Always perform initialization of worker objects first.
        TipCalculator bartenderCalc = new BartenderServiceTipCalculator(1, 5);
        TipCalculator bagCalc = new BaggageServiceTipCalculator(1.00, ServiceQuality.GOOD, 5);
        
        
        TipCalculatorService service = new TipCalculatorService(bartenderCalc);
        
        double tip = service.getTip();
        System.out.println(tip);
    }
}
