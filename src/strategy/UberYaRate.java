package strategy;

public class UberYaRate implements IStrategy {
    private double baseRate = 3;
    private double kmRate = 1.5;
    private double minuteRate = 0.3;

    public double calculateRate(double distance, double time) {
        return this.baseRate + this.kmRate * distance + this.minuteRate * time;
    }
}
