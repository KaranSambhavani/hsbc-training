package com.hsbc.app.model;

/**
 * 
 * @author Karan
 *
 */
public class Customer {

	private String fname;
	private String lname;
	private String phNo;
	private String email;
	
	public Customer() {
		super();
	}
	public Customer(String fname, String lname, String phNo, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phNo = phNo;
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", phNo=" + phNo + ", email=" + email + "]";
	}
	
	
	
	
}
