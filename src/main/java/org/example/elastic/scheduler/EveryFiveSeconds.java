package org.example.elastic.scheduler;

public class EveryFiveSeconds extends Every {
	
	public EveryFiveSeconds(Runnable job) {
		super(job, 5, 5);
	}
	
}
