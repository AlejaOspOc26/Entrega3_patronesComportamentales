package strategy;

public class TaxiRate implements IStrategy {
    private double baseRate = 4;
    private double kmRate = 1.8;
    private double minuteRate = 0.5;
    private double taxes = 1;

    public double calculateRate(double distance, double time) {
        return this.baseRate + this.kmRate * distance + this.minuteRate * time + this.taxes;
    }
}
