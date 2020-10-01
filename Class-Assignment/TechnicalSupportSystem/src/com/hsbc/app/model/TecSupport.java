package com.hsbc.app.model;

/**
 * 
 * @author Karan
 *
 */
public class TecSupport {

	int id;
	String email;
	String software;
	String os;
	String problem;
	
	
	public TecSupport() {
		super();
	}
	public TecSupport(int id,String email, String software, String os, String problem) {
		super();
		this.id=id;
		this.email = email;
		this.software = software;
		this.os = os;
		this.problem = problem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "id=" + id + ", email=" + email + ", software=" + software + ", os=" + os + ", problem="
				+ problem;
	}
	
	
	
}
