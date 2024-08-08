package com.blurdel.app.consumer;

import com.blurdel.app.di.annotation.Email;
import com.blurdel.app.service.IMessageService;
import com.google.inject.Inject;

public class EmailSender extends MessageSender {

	@Inject
	public EmailSender(@Email IMessageService service) {
		super(service);
	}

}
