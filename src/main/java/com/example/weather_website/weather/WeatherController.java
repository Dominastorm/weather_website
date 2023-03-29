package com.example.weather_website.weather;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {
	@GetMapping("/get_weather")
	public String getWeather(@RequestParam(name = "weathers", required = false) List<Weather> weathers, Model model) {
		model.addAttribute("weathers", List.of(
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
						70.0)));
		return "getWeather";
	}
}
