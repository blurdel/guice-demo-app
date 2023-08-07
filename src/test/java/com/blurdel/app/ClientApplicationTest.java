package com.blurdel.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.blurdel.app.service.MessageService;
import com.blurdel.app.service.MockMessageService;
import com.blurdel.consumer.MyApplication;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class ClientApplicationTest 
{
	private Injector injector;
	
    
	@Before
	public void setup() {
		injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
			}
		});
	}
	
	@After
	public void teardown() {
		injector = null;
	}
	
	@Test
	public void test() {
		MyApplication appTest = injector.getInstance(MyApplication.class);
		assertEquals(true, appTest.sendMessage("user", "email@mail.com"));
	}
	
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
