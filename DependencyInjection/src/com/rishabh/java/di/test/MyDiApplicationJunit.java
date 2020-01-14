package com.rishabh.java.di.test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.rishabh.java.di.consumer.Consumer;
import com.rishabh.java.di.consumer.MyDiApplication;
import com.rishabh.java.di.injector.InjectValuesEmail;
import com.rishabh.java.di.injector.Injector;
import com.rishabh.java.di.service.EmailService;

public class MyDiApplicationJunit {
	private Injector ij;
	@Before
	public void setUp() throws Exception {
		ij = new InjectValuesEmail() {
			@Override
			public Consumer getConsumer() {
				// TODO Auto-generated method stub
				Consumer consumer = new MyDiApplication(new EmailService() {
					@Override
					public void sendMessage(String msg , String rec) {
						System.out.println(msg + " on email to "+rec);
					}
				});
				return consumer;
			}
		};
	}

	@Test
	public void test() {
		Consumer csc = ij.getConsumer();
		csc.processMessage("Hi", "coder");
	}
	@After
	public void tear() {
		ij = null ;
	}

}
