package com.demo.spring.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.demo.spring.db.CustomerDb;
import com.demo.spring.entity.Customer;

/**
 * 
 * @author Karan
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	CustomerDb datastore; 
	
	public List<Customer> listAll()
	{
		List<Customer> l=new ArrayList<>(datastore.getDb().values());
		return l;
	}
	
	public Customer getCustById(int id)
	{
		if(datastore.getDb().containsKey(id))
		{
			return datastore.getDb().get(id);
		}
		else 
		{
			return null;
		}
	}
	
	public String saveCustomer(Customer c)
	{
		if(datastore.getDb().containsKey(c.getCustomerId()))
		{
			return "Emp Exists";
		}
		else
		{
			datastore.getDb().put(c.getCustomerId(),c);
			return "Saved";
		}
	}
	
	
}
