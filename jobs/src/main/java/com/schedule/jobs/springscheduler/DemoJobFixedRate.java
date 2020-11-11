package com.schedule.jobs.springscheduler;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoJobFixedRate {

	private static final Logger LOG = LoggerFactory.getLogger(DemoJobFixedRate.class);
	
	@Scheduled(fixedRate = 1000)
	public void fixedRateJob() {
		
		LOG.info("Fixed delay Job: ");
		Arrays.asList(1,2,3,4,5,6,7,8,9).forEach(System.out::print);
	}
}
