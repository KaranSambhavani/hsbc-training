package com.demo.spring.db;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

/**
 * 
 * @author Karan
 *
 */
@Repository
public class CustomerDb {
 
    private HashMap<Integer,Customer> db=new HashMap<>();
	 
    
	public HashMap<Integer, Customer> getDb() {
		return db;
	}

	public void setDb(HashMap<Integer, Customer> db) {
		this.db = db;
	}

	public CustomerDb() {
		
		db.put(100,new Customer(100,"Karan",73837877));
		db.put(101,new Customer(101,"Harshad",87547877));
		db.put(102,new Customer(102,"Kp",89727877));
		db.put(103,new Customer(103,"Jeet",98767877));
		db.put(104,new Customer(104,"Arjun",91237877));
		db.put(105,new Customer(105,"Jk",67927877));
	}

	
	
	
}
