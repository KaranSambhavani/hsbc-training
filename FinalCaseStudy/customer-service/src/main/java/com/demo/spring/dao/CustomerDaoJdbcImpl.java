package com.demo.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Customer> listAll() {
		
		List<Customer> l=template.query("select * from mycustomers",new RowMapper<Customer>() {
			
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Customer(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		
		});
		
		return l;
	}

	@Override
	public Customer getCustById(int id) {
		Customer c=template.queryForObject("select * from mycustomers where custId="+id,new RowMapper<Customer>() {

			@Override
			public Customer  mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		});
		return c;
	}

	@Override
	public String saveCustomer(Customer c) {
	
		String insert="insert into mycustomers(custId,custname,mobile) values(?,?,?)";
		int row=template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement pst=con.prepareStatement(insert);
				pst.setInt(1,c.getCustomerId());
				pst.setString(2,c.getCustomerName());
				pst.setInt(3,c.getMobile());
				
				return pst;
			}
			
		});
		
		 if(row>=1)
		 {
			 return "Data inserted";
		 }
		 else
		 {
			 return "Data is not inserted";
		 }
		
	}

}
