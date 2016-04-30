package org.example.elastic;

import java.util.Collection;
import java.util.Collections;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.Plugin;
import org.example.elastic.modules.DataModule;

public class MyPlugin extends Plugin
{

	@Override
	public String description() {
		return "Elasticsearch plugin boilerplate";
	}

	@Override
	public String name() {
		return "elastic-boilerplate";
	}

	@Override
	public Collection<Module> nodeModules() {
		
		return Collections.<Module>singletonList(
			new DataModule()
		);
		
	}

}
