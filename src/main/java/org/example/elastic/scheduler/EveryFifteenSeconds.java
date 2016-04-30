package org.example.elastic.scheduler;

public class EveryFifteenSeconds extends Every {

	public EveryFifteenSeconds(Runnable job) {
		super(job, 10, 15);
	}

}
