package com.demo.interfaces.classwork2;

public class EmpDaoMocHibernateimpl implements EmpDao {

	@Override
	public Emp findById(int id) {
		
		System.out.println("Hibernate: findById method is called");
		return null;
	}

	@Override
	public String save(Emp e) {
		
		System.out.println("Hibernate: save method is called");
		return null;
	}

	@Override
	public void listAllEmp() {
		
		System.out.println("Hibernate: listall method is called");

	}

}
