package com.example.activityworker.api;

import com.persistance.dto.TempDto;
import com.uber.cadence.activity.ActivityMethod;

public interface GetTempActivities {

    String TASK_LIST = "getTemp";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2, taskList = TASK_LIST)
    TempDto getTempInCity(String cityName);
}
