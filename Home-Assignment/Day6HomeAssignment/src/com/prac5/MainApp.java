package com.prac5;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc=new ProducerConsumer();
		Producer p=new Producer(pc);
		Consumer c=new Consumer(pc);
		
		p.start();
		c.start();

	}

}
