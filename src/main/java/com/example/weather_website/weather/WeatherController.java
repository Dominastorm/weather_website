package com.example.weather_website.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/get_weather")
    public String getWeather(Model model) {
        List<Weather> weathers = weatherService.getAllWeather();
        model.addAttribute("weathers", weathers);
        return "getWeather";
    }

    @GetMapping("/add_weather")
    public String showAddWeatherForm(Model model) {
        Weather weather = new Weather();
        model.addAttribute("weather", weather);
        return "addWeather";
    }

    @PutMapping("/add_weather")
    @RequestMapping(method=RequestMethod.PUT)
    public String addWeather(@ModelAttribute("weather") Weather weather) {
        weatherService.addWeather(weather);
        return "redirect:/get_weather";
    }
}
