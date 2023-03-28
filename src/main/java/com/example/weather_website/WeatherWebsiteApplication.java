package com.example.weather_website;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.weather_website.weather.Weather;

@SpringBootApplication
@RestController
public class WeatherWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebsiteApplication.class, args);
	}

	@GetMapping("/")
	public List<Weather> hello() {
		return List.of(
			new Weather(
				"London",
				LocalDate.now(),
				10.0,
				80.0
			),		
			new Weather(
				"Paris",
				LocalDate.now(),
				12.0,
				70.0
			)
		);
	}
}
