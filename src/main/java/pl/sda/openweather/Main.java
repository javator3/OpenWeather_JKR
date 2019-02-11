package pl.sda.openweather;


import pl.sda.openweather.model.WeatherService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
                "?key=8e42af245b4240d7bc192407191002&q=" );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miejscowość");
        String location;
        location = scanner.next();
        weatherService.getCityWeather(location);


    }
}
