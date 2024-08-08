package com.blurdel.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.blurdel.app.service.IMessageService;
import com.blurdel.app.service.MockMessageService;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class AppTest 
{
	private Injector injector;
	
    
	@Before
	public void setup() {
		injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(IMessageService.class).to(MockMessageService.class);
			}
		});
	}
	
	@After
	public void teardown() {
		injector = null;
	}
	
	@Test
	public void test() {
		IMessageService appTest = injector.getInstance(IMessageService.class);
		assertEquals(true, appTest.sendMessage("user", "email@mail.com"));
	}
	
    @Test
    public void alwaysTrue() {
        assertTrue(true);
    }
}
