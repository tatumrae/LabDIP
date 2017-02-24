package dip.lab2.student.solution1;

/**
 *
 * @author Tatum Thomas
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        setTipCalculator(tipCalculator);
    }
    
    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }
    
    public double getTip() {
        return tipCalculator.getTip();
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        if (tipCalculator == null) {
            throw new IllegalArgumentException("Tip Calculator is mandatory");
        }
        this.tipCalculator = tipCalculator;
    }
    

    
    
}
