package com.task;

import com.demo.io.entity.Emp;

/**
 * 
 * @author Karan
 *
 */
public interface EmpDao {

	public String save(Emp e) throws EmpAlreadyExist;
}
