package strategy;

public class Main {
    public static void main(String[] args) {
        IStrategy uberYa = new UberYaRate();
        IStrategy comfort = new ComfortRate();
        IStrategy taxi = new TaxiRate();

        Trip trip = new Trip(comfort);

        double d = 5.3;
        double t = 8;

        double result = trip.executeStrategy(d, t);
        System.out.println("You are driving with Uber Comfort for $" + result);

        trip.setStrategy(uberYa);
        result = trip.executeStrategy(d, t);
        System.out.println("You are driving with UberYa for $" + result);

        trip.setStrategy(taxi);
        result = trip.executeStrategy(d, t);
        System.out.println("You are driving with UberTaxi for $" + result);

    }
}
