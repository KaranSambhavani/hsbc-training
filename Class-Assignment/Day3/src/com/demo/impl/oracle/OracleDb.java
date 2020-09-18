package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

public class OracleDb implements MyConnection {

	@Override
	public String getConnectionInfo() {
		
		return "Connection Established";
	}

	@Override
	public String getDetails() {
		
		return "Database is Oracle";
	}

}
