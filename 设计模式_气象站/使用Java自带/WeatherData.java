package 使用Java自带;

import java.util.Observable;

public class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity,
                                double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
