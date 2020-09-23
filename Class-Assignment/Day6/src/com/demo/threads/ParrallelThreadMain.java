package com.demo.threads;

public class ParrallelThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MainThread stats...");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		t2.start();
		
		System.out.println(t1);
		System.out.println(Thread.currentThread());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("MainThread Ends..");
	}

}
