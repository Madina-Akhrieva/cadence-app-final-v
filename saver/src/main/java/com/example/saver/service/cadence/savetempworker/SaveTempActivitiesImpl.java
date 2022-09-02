package com.example.saver.service.cadence.savetempworker;


import com.example.saver.service.cadence.api.SaveTempActivities;
import com.example.saver.service.temp.SaveTempService;

import com.persistance.dto.CityTempMarkDto;
import com.persistance.dto.TempDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveTempActivitiesImpl implements SaveTempActivities {

    private final SaveTempService saveTempService;

    @Override
    public CityTempMarkDto saveTempMark(TempDto tempMark) {
        return saveTempService.saveCityTempMark(tempMark);
    }
}
