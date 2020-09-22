package com.task;

import com.demo.io.entity.Emp;

/**
 * 
 * @author Karan
 *
 */
public class EmpService {

	EmpDao ed;

	public EmpService(EmpDao ed) {
		super();
		this.ed = ed;
	}
	
	public String RegisterEmp(int id,String name,String city,double salary)
	{
		String msg;
		try {
			msg = ed.save(new Emp(id,name,city,salary));
		} catch (EmpAlreadyExist e) {
			// TODO Auto-generated catch block
			msg=e.getMessage();
		}
		return msg;
	}
	
	
}
