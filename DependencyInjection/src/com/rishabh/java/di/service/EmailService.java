package com.rishabh.java.di.service;

public class EmailService implements MessageService{
	
	@Override
	public void sendMessage(String msg , String rec) {
		System.out.println(msg + " on email to "+rec);
	} 
}
