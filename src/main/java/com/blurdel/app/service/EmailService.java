package com.blurdel.app.service;

import jakarta.inject.Singleton;

@Singleton
public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String pMsg, String pRecipient) {
		System.out.println("Email sent to " + pRecipient + " with message: " + pMsg);
		return true;
	}

}
