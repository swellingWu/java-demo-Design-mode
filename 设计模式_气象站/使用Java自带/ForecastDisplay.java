package 使用Java自带;

public class ForecastDisplay implements IObserver {

    private ISubject weatherData;

    public ForecastDisplay(ISubject weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    public void update(double temp, double humidity, double presure) {
        System.out.println("I doing forecast work:"+temp+","+humidity+","+presure);
    }
}