package com.blurdel.consumer;

import com.blurdel.app.service.MessageService;
import com.google.inject.Inject;


public class MyApplication {

	private MessageService service;

	
	@Inject
	public MyApplication(MessageService service) {
		super();
		this.service = service;
	}

	@Inject
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public boolean sendMessage(String pMsg, String pRecipient) {
		return service.sendMessage(pMsg, pRecipient);
	}
	
}
