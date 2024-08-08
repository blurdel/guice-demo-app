package com.blurdel.app.consumer;

import com.blurdel.app.service.IMessageService;
import com.google.inject.Inject;


public abstract class MessageSender {

	private IMessageService msgSvc;

	
	@Inject
	protected MessageSender(IMessageService service) {
		this.msgSvc = service;
	}
	
	public boolean sendMessage(String pMsg, String pRecipient) {
		return msgSvc.sendMessage(pMsg, pRecipient);
	}
	
}
