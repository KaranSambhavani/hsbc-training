package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.model.Customer;
import com.hsbc.app.model.TecSupport;

/**
 * 
 * @author Karan
 *
 */
public interface AppDao {

	 public String saveCustomer(Customer c);
	 public void saveTech(TecSupport t);
	 public boolean checkUser(String email);
	 public Customer getCustomerByEmail(String email);
	 public List<TecSupport> getAllRequests();
	 
	  
}
