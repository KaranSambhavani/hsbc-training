package com.hsbc.tr.web;

import java.util.ArrayList;

public class User {

	private String userName;
	private String pass;
	private boolean authenticated;
	ArrayList<String> users=new ArrayList<String>();
	
	public User() {
		users.add("Karan");
        users.add("Ravi");
        users.add("Keval");
        users.add("Mosam");
        users.add("Keta");
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isAuthenticated() {
		if(userName.equals(pass))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public ArrayList<String> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<String> users) {
		this.users = users;
	}
	
	
	
	
	
}
