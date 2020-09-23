package com.prac2;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new MyThreadRunnable());
		t1.start();
		
		Thread t2=new Thread(new MyThreadRunnable());
		t2.start();
		
		Thread t3=new Thread(new MyThreadRunnable());
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		

	}

}
