package com.demo.exceptions.task;

public class MainApp {

	public static void main(String[] args) {
		
		App2 ob=new App2();
		App1 a1=new App1(ob);
		
		System.out.println(a1.calculate(10, 0));
		System.out.println("Example complited");
	}
}
