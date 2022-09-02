package com.example.weathercadenceapp.configure;

import com.example.weathercadenceapp.service.CadenceServiceUtil;
import com.example.weathercadenceapp.service.MainWorkflowWorker;
import com.uber.cadence.client.WorkflowClient;
import com.uber.cadence.worker.WorkerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CadenceConfiguration {

    @Bean
    WorkflowClient workflowClient(
            MainWorkflowWorker workflowWorker) {

        WorkflowClient workflowClient = CadenceServiceUtil.getWorkflowClient();

        WorkerFactory factory = CadenceServiceUtil.getWorkerFactory(workflowClient);
        workflowWorker.startMainWorkflowWorker(factory);
        factory.start();

        return workflowClient;
    }
}
