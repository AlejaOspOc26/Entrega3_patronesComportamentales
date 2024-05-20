package observer;

import memento.Document;
import memento.DocumentHistory;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();

        WeatherDevice phone = new WeatherDevice("Phone", weatherService);
        WeatherDevice tablet = new WeatherDevice("Tablet", weatherService);
        WeatherDevice laptop = new WeatherDevice("Laptop", weatherService);
        WeatherDevice smartwatch = new WeatherDevice("Smartwatch", weatherService);

        // Cambiar el estado del clima antes de suscribir dispositivos
        weatherService.setWeatherStatus("Sunny");
        weatherService.notifyDevices();

        // Suscribir dispositivos
        phone.subscribe();
        tablet.subscribe();

        // Cambiar el estado del clima y notificar
        weatherService.setWeatherStatus("Rainy");
        weatherService.notifyDevices();

        // Suscribir un nuevo dispositivo
        laptop.subscribe();

        // Cambiar el estado del clima y notificar
        weatherService.setWeatherStatus("Stormy");
        weatherService.notifyDevices();

        // Desuscribir un dispositivo
        tablet.unsubscribe();

        // Cambiar el estado del clima y notificar
        weatherService.setWeatherStatus("Cloudy");
        weatherService.notifyDevices();

        // Suscribir otro dispositivo
        smartwatch.subscribe();

        // Cambiar el estado del clima y notificar
        weatherService.setWeatherStatus("Windy");
        weatherService.notifyDevices();
    }
}

