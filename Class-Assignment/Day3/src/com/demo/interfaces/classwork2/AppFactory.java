package com.demo.interfaces.classwork2;

public class AppFactory {

	public static EmpDao getFectory(String msg)
	{
		if(msg.equalsIgnoreCase("JDBC"))
		{
			return new EmpDemoJdbcImpl();
		}
		else if(msg.equalsIgnoreCase("Hibernate"))
		{
			return new EmpDaoMocHibernateimpl();
		}
		else {
			return null;
		}
	}
	
}
