package 自定义;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements ISubject {
    private Set<IObserver> observers = new HashSet<IObserver>();

    double temp;
    double humidity;
    double pressure;

    public void registObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void mesurementsChanged(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
}