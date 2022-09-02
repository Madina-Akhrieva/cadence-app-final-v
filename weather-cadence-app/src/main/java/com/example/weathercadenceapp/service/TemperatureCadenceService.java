package com.example.weathercadenceapp.service;


import com.persistance.dto.CityTempMarkDto;
import org.springframework.stereotype.Service;

@Service
public interface TemperatureCadenceService {

    CityTempMarkDto getTemp(String cityName);
}
