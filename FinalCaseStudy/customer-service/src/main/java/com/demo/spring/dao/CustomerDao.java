package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.entity.Customer;

/**
 * 
 * @author Karan
 *
 */
public interface CustomerDao {

	public List<Customer> listAll();
	public Customer getCustById(int id);
	public String saveCustomer(Customer c);
}
