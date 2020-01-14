package com.rishabh.java.di.consumer;

import com.rishabh.java.di.service.MessageService;

public class MyDiApplication implements Consumer{
	private MessageService msc;
	public MyDiApplication(MessageService msc){
		this.msc = msc;
	}
	@Override
	public void processMessage(String msg , String rec) {
		this.msc.sendMessage(msg, rec);
	}
}
