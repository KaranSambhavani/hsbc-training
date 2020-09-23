package com.prac7;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				MyThread t1=new MyThread();
				t1.start();
				
				Thread t2=new Thread(new MyThreadRunnable());
				t2.start();
				
				try {
					t1.join();
					t2.join();
					
				} catch (InterruptedException e) {
					System.out.println(e);
				}
	}

}
