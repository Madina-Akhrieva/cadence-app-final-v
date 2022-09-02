package com.example.saver.service.cadence.savetempworker;

import com.example.saver.service.cadence.CadenceServiceUtil;
import com.example.saver.service.cadence.api.SaveTempActivities;
import com.example.saver.service.temp.SaveTempService;
import com.uber.cadence.worker.Worker;
import com.uber.cadence.worker.WorkerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTempWorker {

    private final SaveTempService saveTempService;

    public Worker startSaveTempWorker(WorkerFactory factory) {
        Worker worker = CadenceServiceUtil.getWorker(factory, SaveTempActivities.TASK_LIST);
        worker.registerActivitiesImplementations(new SaveTempActivitiesImpl(saveTempService));
        return worker;
    }
}
