package com.prac8;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Hello this is "+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
		
	}

	
}
