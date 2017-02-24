package dip.lab2.student.solution1;

/**
 *
 * @author Tatum Thomas
 */
public class BartenderServiceTipCalculator implements TipCalculator {
    
    private double amountPerDrink;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;
    private int drinkCount;

    public BartenderServiceTipCalculator(double amountPerDrink, int drinkCount) {
        this.amountPerDrink = amountPerDrink;
        this.drinkCount = drinkCount;
    }
    
    @Override
    public final double getTip() {
        return amountPerDrink * drinkCount;
    }

    public final int getDrinkCount() {
        return drinkCount;
    }

    public final void setDrinkCount(int drinkCount) {
        // needs validation
        this.drinkCount = drinkCount;
    }

    public final double getAmountPerDrink() {
        return amountPerDrink;
    }

    public final void setAmountPerDrink(double amountPerDrink) {
        // needs validation
        this.amountPerDrink = amountPerDrink;
    }

    @Override
    public final double getGoodTip() {
        return 0;
    }

    @Override
    public final void setGoodTip(double goodTip) {
    }

    @Override
    public final double getFairTip() {
        return 0;
    }

    @Override
    public final void setFairTip(double fairTip) {
    }

    @Override
    public final double getPoorTip() {
        return 0;
    }

    @Override
    public final void setPoorTip(double poorTip) {
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality.GOOD;
    }

    @Override
    public final void setServiceQuality(ServiceQuality serviceQuality) {
    }


}
