package com.collections.task;

import com.demo.training.entity.Emp;

public class MainApp {

	public static void main(String[] args) {
		
		EmpDao ed=new EmpDao();
		EmpService es=new EmpService(ed);
		
		es.register(new Emp(1,"Karan1","Pune",60000));
		es.register(new Emp(2,"Karan2","Pune",80000));
		es.register(new Emp(3,"Karan3","Pune",100000));
		es.register(new Emp(4,"Karan4","Pune",120000));
		es.register(new Emp(5,"Karan5","Pune",140000));
		es.register(new Emp(5,"Karan5","Pune",140000));
		
		
		es.display();
		es.deleteById(2);
		System.out.println();
		es.display();
		
		

	}

}
