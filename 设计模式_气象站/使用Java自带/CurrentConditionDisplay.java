package 使用Java自带;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            display(wd.getTemperature(), wd.getHumidity(), wd.getPressure());
        }
    }

    public void display(double temp, double humidity, double presure) {
        System.out.println("I doing current work:" + temp + "," + humidity
                + "," + presure);
    }
}