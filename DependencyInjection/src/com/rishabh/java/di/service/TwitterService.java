package com.rishabh.java.di.service;

public class TwitterService implements MessageService {
	@Override
	public void sendMessage(String msg , String rec) {
		System.out.println(msg + " on twitter to " + rec );
	}
}
