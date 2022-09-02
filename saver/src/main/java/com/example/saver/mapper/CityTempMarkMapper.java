package com.example.saver.mapper;


import com.example.saver.domain.CityTempMarkModel;
import com.persistance.dto.CityTempMarkDto;
import com.persistance.dto.TempDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Component
public class CityTempMarkMapper {

    public CityTempMarkModel mapCityTempMarkDtoInCityTempMark(CityTempMarkDto cityTempMark) {
        return CityTempMarkModel.builder()
                .cityName(cityTempMark.getCityName())
                .temperature(cityTempMark.getTemperature())
                .requestTime(cityTempMark.getRequestTime())
                .build();
    }

    public CityTempMarkDto mapCityTempMarkInCityTempMarkDto(CityTempMarkModel cityTempMarkModel) {
        return CityTempMarkDto.builder()
                .cityName(cityTempMarkModel.getCityName())
                .temperature(cityTempMarkModel.getTemperature())
                .requestTime(cityTempMarkModel.getRequestTime())
                .build();
    }

    public CityTempMarkModel mapTempDtoInCityTempMark(TempDto tempDto) {
        return CityTempMarkModel.builder()
                .cityName(tempDto.getName())
                .temperature(tempDto.getMain().get("temp"))
                .requestTime(LocalDateTime.from(ZonedDateTime.now()))
                .build();
    }
}
