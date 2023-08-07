package com.blurdel.app.service;

import jakarta.inject.Singleton;

@Singleton
public class FacebookService implements MessageService {

	@Override
	public boolean sendMessage(String pMsg, String pRecipient) {
		System.out.println("Message sent to Facebook user " + pRecipient + " with message: " + pMsg);
		return true;
	}

}
