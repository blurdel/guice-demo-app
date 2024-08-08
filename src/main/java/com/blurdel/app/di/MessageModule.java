package com.blurdel.app.di;

import com.blurdel.app.di.annotation.Email;
import com.blurdel.app.di.annotation.SMS;
import com.blurdel.app.service.EmailService;
import com.blurdel.app.service.FacebookService;
import com.blurdel.app.service.IMessageService;
import com.google.inject.AbstractModule;

public class MessageModule extends AbstractModule {

	@Override
	protected void configure() {
		
		bind(IMessageService.class).annotatedWith(Email.class)
			.to(EmailService.class);
		
		bind(IMessageService.class).annotatedWith(SMS.class)
			.to(FacebookService.class);
	}

}
