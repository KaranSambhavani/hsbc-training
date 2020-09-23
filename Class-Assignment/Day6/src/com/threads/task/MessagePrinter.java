package com.threads.task;

public class MessagePrinter {

	public synchronized void print(String msg)
	{
		System.out.println(msg);
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
		 
			System.out.println(e);	
		}
	}
}
