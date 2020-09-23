package com.prac3;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new MyRunnable());
		t1.start();
		
		try {
			t1.join();
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		

	}

}
