package com.rishabh.java.di.injector;

import com.rishabh.java.di.consumer.Consumer;
import com.rishabh.java.di.consumer.MyDiApplication;
import com.rishabh.java.di.service.EmailService;

public class InjectValuesEmail implements Injector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		Consumer consumer = new MyDiApplication(new EmailService());
		return consumer;
	}
	
}
