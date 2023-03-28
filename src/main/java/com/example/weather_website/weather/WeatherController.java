package com.example.weather_website.weather;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/weather")
public class WeatherController {
    
	@GetMapping
	public List<Weather> hello() {
		return List.of(
			new Weather(
                1L,
				"London",
				LocalDate.now(),
				10.0,
				80.0
			),		
			new Weather(
                2L,
				"Paris",
				LocalDate.now(),
				12.0,
				70.0
			)
		);
	}
    
}
