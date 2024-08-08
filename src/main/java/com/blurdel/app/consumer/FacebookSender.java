package com.blurdel.app.consumer;

import com.blurdel.app.di.annotation.SMS;
import com.blurdel.app.service.IMessageService;
import com.google.inject.Inject;

public class FacebookSender extends MessageSender {

	@Inject
	public FacebookSender(@SMS IMessageService service) {
		super(service);
	}

}
