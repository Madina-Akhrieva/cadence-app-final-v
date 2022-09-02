package com.example.weathercadenceapp.service;

import com.persistance.dto.CityTempMarkDto;
import com.uber.cadence.workflow.WorkflowMethod;

public interface TemperatureWorkflow {

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 10, taskList = CadenceServiceUtil.TASK_LIST)
    CityTempMarkDto getTemperature(String cityName);
}
