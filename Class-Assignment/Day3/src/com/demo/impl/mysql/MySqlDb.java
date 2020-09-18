package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDb implements MyConnection{

	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connection Esstablished";
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Mysql database";
	}

}
