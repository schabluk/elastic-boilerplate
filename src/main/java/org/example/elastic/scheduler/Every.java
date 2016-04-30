package org.example.elastic.scheduler;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class Every {
	
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private final ScheduledFuture<?> jobHandle;
	
	public Every(Runnable job, long initialDelay, long period) {
		jobHandle = scheduler.scheduleAtFixedRate(job, initialDelay, period, SECONDS);
	}
	
	public ScheduledFuture<?> getJobHandle() {
		return jobHandle;
	}
	
	public void stopAfter(long lifetime) {
		scheduler.schedule(new Runnable() {
			public void run() { 
				jobHandle.cancel(true);
			}
		}, lifetime, SECONDS);
	}
}
