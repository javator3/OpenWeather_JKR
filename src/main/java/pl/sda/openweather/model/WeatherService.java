package pl.sda.openweather.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WeatherService {

    private String finalURL;

    private String url;
    private String apiKey;

    public WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;

    }

//
//    WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
//            "KLUCZ API");


    public void getCityWeather (String city) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta");
        city = scanner.nextLine();
        city = apiKey;

        finalURL=url+ "="+city;

        URL jsonURL = new URL (finalURL);
        ObjectMapper objectMapper = new ObjectMapper();
        Weather weather = null;
        try {
            weather = objectMapper.readValue(jsonURL, Weather.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(weather);

    }

    @Override
    public String toString() {
        return "WeatherService{" +
                "finalURL='" + finalURL + '\'' +
                ", url='" + url + '\'' +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}
