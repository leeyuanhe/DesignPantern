package pattern.Observer.custom;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,34,33.3f);

        ccd.display();

    }

}
