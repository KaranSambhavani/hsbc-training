package com.demo.app2.dao;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDao ob=new EmpDaoImpl();
		EmpService es=new EmpService(ob);
		
		System.out.println(es.registerEmp(2, "karan"));

	}

}
