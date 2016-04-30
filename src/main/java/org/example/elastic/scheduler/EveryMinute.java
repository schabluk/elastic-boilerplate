package org.example.elastic.scheduler;

public class EveryMinute extends Every {

	public EveryMinute(Runnable job) {
		super(job, 10, 60);
	}

}
