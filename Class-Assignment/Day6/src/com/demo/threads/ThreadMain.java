package com.demo.threads;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
