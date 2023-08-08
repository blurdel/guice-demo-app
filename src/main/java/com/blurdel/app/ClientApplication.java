package com.blurdel.app;

import com.blurdel.app.consumer.MyApplication;
import com.blurdel.app.di.AppInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {

	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new AppInjector());
		
		MyApplication app = injector.getInstance(MyApplication.class);
		
		app.sendMessage("Hello World!", "user@email.com");
	}
	
}
