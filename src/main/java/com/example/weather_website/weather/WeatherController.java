package com.example.weather_website.weather;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/weather")
public class WeatherController {
    
	private final WeatherService weatherService;

	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	} 

	@GetMapping
	public List<Weather> getWeather() {
		return weatherService.getWeather();
	}
    
}
