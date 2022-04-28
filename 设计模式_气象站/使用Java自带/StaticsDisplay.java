package 使用Java自带;

public class StaticsDisplay implements IObserver {

    private ISubject weatherData;

    public StaticsDisplay(ISubject weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    public void update(double temp, double humidity, double presure) {
        System.out.println("I doing statics work:"+temp+","+humidity+","+presure);
    }
}