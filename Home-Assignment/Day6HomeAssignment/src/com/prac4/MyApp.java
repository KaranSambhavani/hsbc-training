package com.prac4;

/**
 * 
 * @author Karan
 *
 * When we use join method in thread then another thread or main will wait till that thread will finish its task. 
 */
public class MyApp {

	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("MainThread stats...");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		System.out.println("MainThread Ends..");
		

	}

}
