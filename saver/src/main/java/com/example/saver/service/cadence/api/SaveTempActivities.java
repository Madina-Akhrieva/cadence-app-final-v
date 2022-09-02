package com.example.saver.service.cadence.api;

import com.persistance.dto.CityTempMarkDto;
import com.persistance.dto.TempDto;
import com.uber.cadence.activity.ActivityMethod;

public interface SaveTempActivities {

    String TASK_LIST = "saveTemp";

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2, taskList = TASK_LIST)
    CityTempMarkDto saveTempMark(TempDto tempMark);
}
