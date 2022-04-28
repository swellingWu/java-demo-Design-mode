package 自定义;

public class CurrentConditionDisplay implements IObserver{

    private ISubject weatherData;

    public CurrentConditionDisplay(ISubject weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    public void update(double temp, double humidity, double presure) {
        System.out.println("I doing current work:"+temp+","+humidity+","+presure);
    }
}