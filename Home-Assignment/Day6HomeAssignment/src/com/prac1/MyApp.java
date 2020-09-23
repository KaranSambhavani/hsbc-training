package com.prac1;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1=new MyThread();
		t1.start();
		
		MyThread t2=new MyThread();
		t2.start();
		
		MyThread t3=new MyThread();
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
