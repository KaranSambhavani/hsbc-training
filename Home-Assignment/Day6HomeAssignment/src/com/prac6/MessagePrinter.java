package com.prac6;

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
