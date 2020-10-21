package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.spring.entity.Customer;
import com.demo.spring.service.CustomerService;

/**
 * 
 * @author Karan
 *
 */
@RestController
@CrossOrigin
public class CustomerRestController {

	@Autowired
	CustomerService service;
	
	@RequestMapping(path="/cust/find/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getCustDetails(@PathVariable("id")int id)
	{
		
		Customer c=service.getCustById(id);
		
		if(c!=null)
		{
			return ResponseEntity.ok(c);
		}
		else
		{
			return ResponseEntity.ok("Not Foubd");
		}
		
	}
	
	@GetMapping(path="/cust",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getDetails()
	{
		List<Customer> l=service.listAll();
		return ResponseEntity.ok(l);
	}
	
	@PostMapping(path="/cust/save",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Customer c)
	{
		String s=service.saveCustomer(c);
		return ResponseEntity.ok(s);
	}
	
	
}
