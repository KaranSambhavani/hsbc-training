package com.prac7;

public class MyThread extends Thread {

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
