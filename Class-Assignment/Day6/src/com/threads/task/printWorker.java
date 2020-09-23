package com.threads.task;

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
		
		//we can use this block or synchronized keyword before method
		synchronized (mp) {
			mp.print(msg);
		}
			
	
	}
}
