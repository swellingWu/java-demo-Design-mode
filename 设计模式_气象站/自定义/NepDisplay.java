package 自定义;

public class NepDisplay implements IObserver{
    private ISubject weatherData;

    public  NepDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("I doing nep work:"+temp+","+humidity+","+pressure);
    }
}
