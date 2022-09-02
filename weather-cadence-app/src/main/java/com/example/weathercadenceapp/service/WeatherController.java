package com.example.weathercadenceapp.service;

import com.persistance.dto.CityTempMarkDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@AllArgsConstructor
public class WeatherController {

    private final TemperatureCadenceServiceImpl temperatureCadenceService;

    @GetMapping("/{cityName}")
    public CityTempMarkDto getWeather(@PathVariable String cityName) {
        return temperatureCadenceService.getTemp(cityName);
    }
}
