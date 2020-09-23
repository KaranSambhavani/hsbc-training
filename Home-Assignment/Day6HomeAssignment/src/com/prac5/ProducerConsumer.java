package com.prac5;

public class ProducerConsumer {

	private int value;
	private boolean available=false;
	
	public synchronized void  put(int val)
	{
		
		while(available==true)
		{
			try {
				wait();
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		value=val;
		available=true;
		notifyAll();
		
	}
	public synchronized int get()
	{
		
		while(available==false)
		{
			try {
				wait();
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		available=false;
		notifyAll();
		return value;
		
	}
	
}
