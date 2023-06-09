package com.example.weather_website.weather;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Weather {
    
    @Id
    @SequenceGenerator(
        name = "weather_sequence",
        sequenceName = "weather_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "weather_sequence"
    )
    private Long id;
    private String city;
    private LocalDate date;
    private Double temperature;
    private Double humidity;    
    
    public Weather() {}

    public Weather(Long id, String city, LocalDate date, Double temperature, Double humidity) {
        this.id = id;
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Weather(String city, LocalDate date, Double temperature, Double humidity) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
