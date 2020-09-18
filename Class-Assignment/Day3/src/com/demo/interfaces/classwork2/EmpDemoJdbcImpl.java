package com.demo.interfaces.classwork2;

public class EmpDemoJdbcImpl implements EmpDao {

	@Override
	public Emp findById(int id) {
		
		System.out.println("JDBC: findById method is called");
		return null;
	}

	@Override
	public String save(Emp e) {
		System.out.println("JDBC: save method is called");
		return null;
	}

	@Override
	public void listAllEmp() {
		System.out.println("JDBC: listall method is called");

	}

}
