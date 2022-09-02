//package com.example.weatherapp.controller;
//
//import com.example.weathercadenceapp.service.TemperatureCadenceServiceImpl;
//import com.persistance.dto.CityTempMarkDto;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import service.TemperatureCadenceService;
//
//@RestController
//@RequestMapping("/api/weather")
//@AllArgsConstructor
//public class WeatherController {
//
//    private final TemperatureCadenceServiceImpl temperatureCadenceService;
//
//    @GetMapping("/{cityName}")
//    public CityTempMarkDto getWeather(@PathVariable String cityName) {
//        return temperatureCadenceService.getTemp(cityName);
//    }
//}
