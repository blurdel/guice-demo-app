package com.blurdel.app.service;

import com.google.inject.Singleton;

@Singleton
public class FacebookService implements IMessageService {

	@Override
	public boolean sendMessage(String pRecipient, String pMsg) {
		System.out.println("Facebook post sent to " + pRecipient + ", " + pMsg);
		return true;
	}

}
