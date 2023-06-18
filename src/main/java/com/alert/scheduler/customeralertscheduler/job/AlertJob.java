package com.alert.scheduler.customeralertscheduler.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlertJob {
    @Scheduled(cron = "*/1 * * * * *")
    public void customerAlertJob() {
        System.out.println("inside customerAlertjob");

    }
}
