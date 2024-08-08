package com.blurdel.app.service;

import com.google.inject.Singleton;

@Singleton
public class EmailService implements IMessageService {

	@Override
	public boolean sendMessage(String pRecipient, String pMsg) {
		System.out.println("Email sent to " + pRecipient + ", " + pMsg);
		return true;
	}

}
