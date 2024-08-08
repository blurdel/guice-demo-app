package com.blurdel.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.blurdel.app.di.MessageModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class InjectorBuilder {

	private final List<Module> modules = new ArrayList<>();
	
	
	public InjectorBuilder() {
		// empty
	}
	
	public Injector build() {
		
		modules.addAll(
				Arrays.asList(
						new MessageModule()
				));
		
		return Guice.createInjector(modules);
	}
}
