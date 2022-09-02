package service;


import com.persistance.dto.CityTempMarkDto;

public interface TemperatureCadenceService {

    CityTempMarkDto getTemp(String cityName);
}
