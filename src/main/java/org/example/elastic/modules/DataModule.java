package org.example.elastic.modules;

import org.elasticsearch.common.inject.AbstractModule;
import org.example.elastic.collectors.DataCollector;

public class DataModule extends AbstractModule {

	@Override
	protected void configure() {
		
		/* Collect CPU, memory and storage */
        bind(DataCollector.class).asEagerSingleton();
        
	}

}
