package observer;

public class WeatherDevice implements IDevice{

    private String deviceName;
    private WeatherService weatherService;

    public WeatherDevice(String deviceName, WeatherService weatherService) {
        this.deviceName = deviceName;
        this.weatherService = weatherService;
    }

    @Override
    public void update(Object context) {
        System.out.println("Weather update received on " + deviceName + ": " + context);
    }

    public void subscribe() {
        weatherService.subscribe(this);
        System.out.println(deviceName + " subscribed to weather updates.");
    }

    public void unsubscribe() {
        weatherService.unsubscribe(this);
        System.out.println(deviceName + " unsubscribed from weather updates.");
    }
}
