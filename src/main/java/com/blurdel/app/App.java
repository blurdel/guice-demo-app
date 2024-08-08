package com.blurdel.app;

import com.blurdel.app.consumer.EmailSender;
import com.blurdel.app.consumer.FacebookSender;
import com.blurdel.app.consumer.MessageSender;
import com.blurdel.app.di.MessageModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new MessageModule());
		
		
		MessageSender email = injector.getInstance(EmailSender.class);
		email.sendMessage("mark@facebook.com", "Your email msg");
		
		MessageSender fbook = injector.getInstance(FacebookSender.class);
		fbook.sendMessage("@Zuk", "Your FB post");
	}

}
