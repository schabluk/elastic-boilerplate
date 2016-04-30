package org.example.elastic.collectors;

import java.util.concurrent.ScheduledFuture;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.RestController;
import org.example.elastic.scheduler.EveryFiveSeconds;

public class DataCollector extends BaseCollector {
	
    @Inject	
    public DataCollector(Settings settings, RestController controller, Client client) {
		super(settings, client);
	}

	@Override
	protected void getCollectorProperties() {
		// TODO get properties
	}
	
	@Override
	public void sheduleCollectionJob() {
		
		// Collection job
		final Runnable job = new Runnable() {
			public void run() {
				logger.info("Running collection job");
			}
		};
		
		// run job every 5 seconds
		ScheduledFuture<?> jobHandle = (new EveryFiveSeconds(job)).getJobHandle();
		
		if(jobHandle.isDone()) {
			logger.info("The job is done");
		}
	}

}
