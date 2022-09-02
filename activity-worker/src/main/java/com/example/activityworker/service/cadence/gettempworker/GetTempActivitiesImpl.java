package com.example.activityworker.service.cadence.gettempworker;

import com.example.activityworker.api.GetTempActivities;
import com.example.activityworker.service.temp.GetTempService;
import com.persistance.dto.TempDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetTempActivitiesImpl implements GetTempActivities {

    private final GetTempService getTempService;

    @Override
    public TempDto getTempInCity(String cityName) {
        return getTempService.getWeatherFromAPI(cityName);
    }
}
