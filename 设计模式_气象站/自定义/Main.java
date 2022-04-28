package 自定义;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        IObserver cDisplay = new CurrentConditionDisplay(weatherData);
        IObserver sDisplay = new StaticsDisplay(weatherData);
        IObserver fDisplay = new ForecastDisplay(weatherData);
        IObserver nDisplay = new NepDisplay(weatherData);

        weatherData.mesurementsChanged(1.0, 2.0, 3.0);
    }
}