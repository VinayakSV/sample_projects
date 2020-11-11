package com.schedule.jobs.springscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemojobFixedCRON {

	private static final Logger LOG = LoggerFactory.getLogger(DemoJobFixedRate.class);

	@Scheduled(cron = "${cron.expression}")
	public void cronJob() {
		LOG.info("This is CRON expression based job which runs every 1 min ");
	}
}
