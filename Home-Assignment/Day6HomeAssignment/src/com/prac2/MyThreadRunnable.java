package com.prac2;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread()+" Iteration: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
