package com.example.activityworker.configure;

import com.example.activityworker.service.cadence.CadenceServiceUtil;
import com.example.activityworker.service.cadence.gettempworker.GetTempWorker;
import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(GetTempWorker getTempWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        getTempWorker.startGetTempWorker(factory);
        factory.start();

        return workflowClient;
    }
}
