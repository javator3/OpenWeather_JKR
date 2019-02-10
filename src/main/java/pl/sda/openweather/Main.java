package pl.sda.openweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;
import pl.sda.openweather.model.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

//        try {
//            URL jsonURL = new URL("http://api.apixu.com/v1/current.json?key=8e42af245b4240d7bc192407191002&q=Paris");
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            Weather weather = null;
//
//            weather = objectMapper.readValue(jsonURL, Weather.class);
//            System.out.println(weather);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//
//        }

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json","" );

        weatherService.getCityWeather("Torun");




    }
}
