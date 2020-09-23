package com.threads.task;

public class MainApp {

	public static void main(String[] args) {
		
		MessagePrinter mp=new MessagePrinter();
		
		printWorker worker1=new printWorker(mp,"Hello this is worker1");
		Thread t1=new Thread(worker1);
		
		printWorker worker2=new printWorker(mp,"Hello this is worker2");
		Thread t2=new Thread(worker2);

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
