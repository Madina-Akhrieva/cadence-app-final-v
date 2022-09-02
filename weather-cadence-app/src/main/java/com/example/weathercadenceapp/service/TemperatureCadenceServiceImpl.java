package com.example.weathercadenceapp.service;

import com.persistance.dto.CityTempMarkDto;
import com.uber.cadence.client.WorkflowClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.TemperatureCadenceService;

@Service
@RequiredArgsConstructor
public class TemperatureCadenceServiceImpl implements TemperatureCadenceService {

    private final WorkflowClient workflowClient;

    public CityTempMarkDto getTemp(String cityName) {
        TemperatureWorkflow workflow = workflowClient.newWorkflowStub(TemperatureWorkflow.class);
        return workflow.getTemperature(cityName);
    }
}
