package com.blurdel.app.service;

import com.google.inject.Singleton;

@Singleton
public class MockMessageService implements IMessageService {

	@Override
	public boolean sendMessage(String pRecipient, String pMsg) {
		return true;
	}

}
