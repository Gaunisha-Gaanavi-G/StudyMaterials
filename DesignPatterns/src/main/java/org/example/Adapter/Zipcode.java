package org.example.Adapter;

public class Zipcode {
    public void findTemperature(int zipcode){
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        int temp = weatherAdapter.calculateTemperature(zipcode);
        System.out.println(temp);
    }
}
