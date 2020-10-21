package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

/**
 * 
 * @author Karan
 *
 */
@Service
public class CustomerService {

	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	private CustomerDao dao;
	
	public List<Customer> listAll()
	{
		return dao.listAll();
	}
	
	public Customer getCustById(int id)
	{
		return dao.getCustById(id);
	}
	
	public String saveCustomer(Customer c)
	{
		return dao.saveCustomer(c);
	}
	
	
}
