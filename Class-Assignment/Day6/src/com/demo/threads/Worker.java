package com.demo.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" Iteration: "+i);
				Thread.sleep(1000);
				
			}
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
}
