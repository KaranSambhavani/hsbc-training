package com.demo.inheritance.demo1;

public class App {
   
	public static void main(String[] args) {
		
		Person p=new Person(1,"Karan");
		System.out.println(p.getDetails());
		
		Employee e=new Employee(2, "Karan2",60000);
		System.out.println(e.getDetails());
		
		System.out.println(e);
		
		
		TraineeEmployee te=new TraineeEmployee(3,"Karan3",90000,"Good");
		System.out.println(te.getDetails());
		
		
		
	}
	
	
}
