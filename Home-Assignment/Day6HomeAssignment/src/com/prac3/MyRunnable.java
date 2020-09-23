package com.prac3;

public class MyRunnable implements Runnable {
	@Override
	public void run() {

		try {
		    
			for(int i=1;i<=20;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				
			}
		  }
		catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
