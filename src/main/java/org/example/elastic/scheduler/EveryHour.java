package org.example.elastic.scheduler;

public class EveryHour extends Every {

	public EveryHour(Runnable job) {
		super(job, 10, 60*60);
	}

}
