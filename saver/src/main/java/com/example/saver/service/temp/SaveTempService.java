package com.example.saver.service.temp;

import com.example.saver.domain.CityTempMarkModel;
import com.example.saver.mapper.CityTempMarkMapper;
import com.example.saver.repository.CityTempMarkRepository;
import com.persistance.dto.CityTempMarkDto;
import com.persistance.dto.TempDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTempService {

    private final CityTempMarkRepository repository;

    private final CityTempMarkMapper mapper;

    public CityTempMarkDto saveCityTempMark(TempDto tempDto) {
        CityTempMarkModel tempMark = repository.save(mapper.mapTempDtoInCityTempMark(tempDto));
        return mapper.mapCityTempMarkInCityTempMarkDto(tempMark);
    }
}
