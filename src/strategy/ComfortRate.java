package strategy;

public class ComfortRate implements IStrategy {
    private double baseRate = 6;
    private double kmRate = 2;
    private double minuteRate = 0.6;

    public double calculateRate(double distance, double time) {
        return this.baseRate + this.kmRate * distance + this.minuteRate * time;
    }
}
