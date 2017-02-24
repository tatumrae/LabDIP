package dip.lab2.student.solution1;

/**
 *
 * @author Tatum Thomas
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double baseRate;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;
    private int bagCount;

    public BaggageServiceTipCalculator(double baseRate, ServiceQuality serviceQuality, int bagCount) {
        this.baseRate = baseRate;
        this.serviceQuality = serviceQuality;
        this.bagCount = bagCount;
    }
    
    @Override
    public final double getTip() {
        double tip = 0;
        switch(serviceQuality) {
            case GOOD:
                tip = baseRate * bagCount * goodTip;
                break;
            case FAIR:
                tip = baseRate * bagCount * fairTip;
                break;
            case POOR:
                tip = baseRate * bagCount * poorTip;
                break;
        }
        return tip;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        // needs validation
        this.bagCount = bagCount;
    }

    public final double getBaseRate() {
        return baseRate;
    }

    public final void setBaseRate(double baseRate) {
        // needs validation
        this.baseRate = baseRate;
    }

    @Override
    public final double getGoodTip() {
        return goodTip;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        // needs validation
        this.goodTip = goodTip;
    }

    @Override
    public final double getFairTip() {
        return fairTip;
    }

    @Override
    public final void setFairTip(double fairTip) {
        // needs validation
        this.fairTip = fairTip;
    }

    @Override
    public final double getPoorTip() {
        return poorTip;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        // needs validation
        this.poorTip = poorTip;
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public final void setServiceQuality(ServiceQuality serviceQuality) {
        // needs validation
        this.serviceQuality = serviceQuality;
    }


}
