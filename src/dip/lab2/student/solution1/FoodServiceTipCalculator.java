package dip.lab2.student.solution1;

/**
 *
 * @author Tatum Thomas
 */
public class FoodServiceTipCalculator implements TipCalculator {
    
    private double billAmt;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(double billAmt, ServiceQuality serviceQuality) {
        this.billAmt = billAmt;
        this.serviceQuality = serviceQuality;
    }
    
    @Override
    public final double getTip() {
        double tip = 0;
        switch(serviceQuality) {
            case GOOD:
                tip = billAmt * goodTip;
                break;
            case FAIR:
                tip = billAmt * fairTip;
                break;
            case POOR:
                tip = billAmt * poorTip;
                break;
        }
        return tip;
    }

    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        // needs validation
        this.billAmt = billAmt;
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
