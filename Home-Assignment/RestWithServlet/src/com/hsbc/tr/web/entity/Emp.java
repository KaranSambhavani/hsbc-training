package com.hsbc.tr.web.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Emp {
   
	int empId;
	String name;
	String city;
	double salary;
	
	
	public Emp() {
		super();
	}


	public Emp(int empId, String name, String city, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
	
}
