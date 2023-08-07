package com.blurdel.app.service;

public class MockMessageService implements MessageService{

    public boolean sendMessage(String pMsg, String pReceipient) {
        return true;
    }

}
