package com.schedule.jobs.springscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


public class DemoSpringSchedulerJob {

	private static final Logger LOG = LoggerFactory.getLogger(DemoSpringSchedulerJob.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		LOG.info("The time is now {} ", dateFormat.format(new Date()));
	}
	
}
