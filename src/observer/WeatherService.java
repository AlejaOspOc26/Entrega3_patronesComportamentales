package observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherService {

    private List<IDevice> devices;
    private String weatherStatus;

    public WeatherService() {
        devices = new LinkedList<>();
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
        System.out.println("Weather status set to: " + weatherStatus);
    }

    public void subscribe(IDevice device) {
        devices.add(device);
    }

    public void unsubscribe(IDevice device) {
        devices.remove(device);
    }

    public void notifyDevices() {
        System.out.println("Notifying devices...");
        for (IDevice device : devices) {
            device.update(weatherStatus);
        }
    }

}
