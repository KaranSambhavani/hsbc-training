package com.prac6;

public class printWorker implements Runnable {

	private String msg;
	private MessagePrinter mp;
	
	public printWorker(MessagePrinter mp,String msg) {
		super();
		this.msg = msg;
		this.mp=mp;
	}

	
	@Override
	public void run() {
		
		mp.print(msg);
		
	}
}
