package com.demo.interfaces.classwork2;

public interface EmpDao {

	
	public Emp findById(int id);
	public String save(Emp e);
	public void listAllEmp();
	
}
