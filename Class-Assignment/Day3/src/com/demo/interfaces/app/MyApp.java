package com.demo.interfaces.app;

import com.demo.impl.mysql.MySqlDb;
import com.demo.impl.oracle.OracleDb;
import com.demo.interfaces.MyConnection;

public class MyApp {

	public static void main(String[] args) {
		MyConnection con=new OracleDb();
		System.out.println(MyConnection.relesVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDetails());
		
		MyConnection con1=new MySqlDb();
		System.out.println(MyConnection.relesVer);
		System.out.println(con1.getConnectionInfo());
		System.out.println(con1.getDetails());
		
		
	}
}
