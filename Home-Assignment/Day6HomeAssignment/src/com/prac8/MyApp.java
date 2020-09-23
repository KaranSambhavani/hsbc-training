package com.prac8;

public class MyApp {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.setPriority(2);
		
		MyThread t2=new MyThread();
		t2.setPriority(6);
		
		MyThread t3=new MyThread();
		t3.setPriority(8);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
