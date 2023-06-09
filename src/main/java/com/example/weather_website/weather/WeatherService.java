package com.example.weather_website.weather;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public List<Weather> getWeather() {
        return List.of(
                new Weather(
                        1L,
                        "London",
                        LocalDate.now(),
                        10.0,
                        80.0),
                new Weather(
                        2L,
                        "Paris",
                        LocalDate.now(),
                        12.0,
                        70.0));
    }
}
