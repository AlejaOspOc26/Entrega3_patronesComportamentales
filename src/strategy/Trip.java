package strategy;

public class Trip {
    private IStrategy strategy;
    public Trip(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public double executeStrategy(double distance, double time) {
        return strategy.calculateRate(distance, time);
    }
}
