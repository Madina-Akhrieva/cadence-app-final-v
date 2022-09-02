package com.example.saver.configure;

import com.example.saver.service.cadence.CadenceServiceUtil;
import com.example.saver.service.cadence.savetempworker.SaveTempWorker;
import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(SaveTempWorker saveTempWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        saveTempWorker.startSaveTempWorker(factory);
        factory.start();

        return workflowClient;
    }
}
