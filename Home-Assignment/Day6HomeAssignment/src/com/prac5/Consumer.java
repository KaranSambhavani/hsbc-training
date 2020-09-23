package com.prac5;

public class Consumer extends Thread {

private ProducerConsumer pc;
	
	public Consumer(ProducerConsumer pc) {
		super();
		this.pc = pc;
	}


	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
		 int val=pc.get();
		 System.out.println("Consmer got: "+val);
			
		}
	}
}
