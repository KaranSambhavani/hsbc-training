package com.hsbc.app.service;

import java.util.List;

import com.hsbc.app.dao.AppDao;
import com.hsbc.app.model.Customer;
import com.hsbc.app.model.TecSupport;

/**
 * 
 * @author Karan
 *
 */
public class TechService {

	private AppDao dao;

	

	public TechService(AppDao dao) {
		super();
		this.dao = dao;
	}

	public boolean validateUser(String email) {
		boolean response = dao.checkUser(email);
		if (response) {
			return true;
		} else {
			return false;
		}
	}

	public boolean registerUser(Customer c) {
		String response=dao.saveCustomer(c);
		if(response.equals("success")) {
		return true;
		}else {
			return false;
		}
	}

	public void registerComplaint(TecSupport ts) {
		dao.saveTech(ts);
	}

	public Customer getCustomerByEmail(String email)
	{
		return dao.getCustomerByEmail(email);
	}
	public List<TecSupport> listAll() {
		
		return dao.getAllRequests();
	}
}
