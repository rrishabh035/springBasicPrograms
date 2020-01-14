package com.rishabh.java.di.test;

import com.rishabh.java.di.consumer.Consumer;
import com.rishabh.java.di.injector.InjectValuesEmail;
import com.rishabh.java.di.injector.Injector;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hey There Rishabh";
		String rec = "Rishabh";
		Injector ij = new InjectValuesEmail(); 
		Consumer csc = ij.getConsumer();
		csc.processMessage(msg, rec);
	}

}
