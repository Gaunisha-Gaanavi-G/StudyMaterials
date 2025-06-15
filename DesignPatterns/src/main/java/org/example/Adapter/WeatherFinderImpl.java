package org.example.Adapter;

public class WeatherFinderImpl implements WeatherFinder {
    @Override
    public int findWeather(String city) {
        return (city.equalsIgnoreCase("Coimbatore"))?33:0;
    }
    public String findCity(int zipcode){
        return (zipcode == 641025) ? "Coimbatore":null;
    }

}
