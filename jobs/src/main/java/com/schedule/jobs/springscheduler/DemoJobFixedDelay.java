package com.schedule.jobs.springscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoJobFixedDelay {

	private static final Logger LOG = LoggerFactory.getLogger(DemoJobFixedRate.class);
	
	@Scheduled(fixedDelay = 10000)
	public void fixeddelayJob() {
		LOG.info("This is fixed delay job: for every 10 sec");
	}
}
