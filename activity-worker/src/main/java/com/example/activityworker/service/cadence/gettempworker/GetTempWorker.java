package com.example.activityworker.service.cadence.gettempworker;

import com.example.activityworker.api.GetTempActivities;
import com.example.activityworker.service.cadence.CadenceServiceUtil;
import com.example.activityworker.service.temp.GetTempService;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetTempWorker {

    private final GetTempService getTempService;

    public Worker startGetTempWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, GetTempActivities.TASK_LIST);
        worker.registerActivitiesImplementations(new GetTempActivitiesImpl(getTempService));
        return worker;
    }
}
