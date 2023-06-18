package com.alert.scheduler.customeralertscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CustomeralertschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomeralertschedulerApplication.class, args);
	}

}
