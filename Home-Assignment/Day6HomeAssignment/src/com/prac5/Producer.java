package com.prac5;

public class Producer extends Thread {

	private ProducerConsumer pc;
	
	public Producer(ProducerConsumer pc) {
		super();
		this.pc = pc;
	}


	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Produce Written: "+i);
		   pc.put(i);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}
}
