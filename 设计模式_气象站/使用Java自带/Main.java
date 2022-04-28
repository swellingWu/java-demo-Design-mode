package 使用Java自带;

import 自定义.WeatherData;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();;

        weatherData.mesurementsChanged(1.0, 2.0, 3.0);
    }
}