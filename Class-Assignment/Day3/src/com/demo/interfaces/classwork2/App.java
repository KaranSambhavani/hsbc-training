package com.demo.interfaces.classwork2;

public class App {

	public static void main(String[] args) {
		Emp e=new Emp(1,"karan");
		
		EmpDao ob=AppFactory.getFectory("Jdbc");
		ob.save(e);
		ob.findById(1);
		ob.listAllEmp();
		
		
		
	}
}
