package org.example.Adapter;

public class WeatherAdapter {
    public int calculateTemperature(int zipcode){
        //Process the zipcode data
        WeatherFinderImpl weatherFinder = new WeatherFinderImpl();
        String city = weatherFinder.findCity(zipcode);
        int temp=weatherFinder.findWeather(city);
        return temp;
    }
}
