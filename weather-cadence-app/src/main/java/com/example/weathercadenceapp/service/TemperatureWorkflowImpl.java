package com.example.weathercadenceapp.service;

import com.example.activityworker.api.GetTempActivities;
import com.example.saver.service.cadence.api.SaveTempActivities;
import com.persistance.dto.CityTempMarkDto;
import com.persistance.dto.TempDto;
import com.uber.cadence.workflow.Workflow;
public class TemperatureWorkflowImpl implements TemperatureWorkflow {

    private final GetTempActivities getTempActivities =
            Workflow.newActivityStub(GetTempActivities.class);

    private final SaveTempActivities saveTempActivities =
            Workflow.newActivityStub(SaveTempActivities.class);

    @Override
    public CityTempMarkDto getTemperature(String cityName) {
        TempDto tempInCity = getTempActivities.getTempInCity(cityName);
        return saveTempActivities.saveTempMark(tempInCity);
    }
}
