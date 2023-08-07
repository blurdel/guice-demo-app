package com.blurdel.app.di;

import com.blurdel.app.service.EmailService;
import com.blurdel.app.service.FacebookService;
import com.blurdel.app.service.MessageService;
import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		
		// Bind the service to implementation class
		bind(MessageService.class).to(EmailService.class);
		
//		bind(MessageService.class).to(FacebookService.class);
		
	}

}
