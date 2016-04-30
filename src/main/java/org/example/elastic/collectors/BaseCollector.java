package org.example.elastic.collectors;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.component.AbstractComponent;
import org.elasticsearch.common.settings.Settings;

public abstract class BaseCollector extends AbstractComponent {

	public Client clusterClient;
	
	public BaseCollector(Settings settings, Client client) {
		super(settings);
		
		this.clusterClient = client;
		
		sheduleCollectionJob();
	}

	protected abstract void getCollectorProperties();
	
	protected abstract void sheduleCollectionJob();
}

