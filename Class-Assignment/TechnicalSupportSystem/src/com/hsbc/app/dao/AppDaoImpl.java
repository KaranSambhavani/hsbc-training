package com.hsbc.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.hsbc.app.model.Customer;
import com.hsbc.app.model.TecSupport;

/**
 * 
 * @author Karan
 *
 */
public class AppDaoImpl implements AppDao {

	@Override
	public String saveCustomer(Customer c) {
           
		Connection conn=null;
		
		try
		{
			String sql="insert into CUSTOMERS values(?,?,?,?)";
			 conn=DatabaseConnection.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			
		   
		    ps.setString(1,c.getEmail());
		    ps.setString(2,c.getFname());
		    ps.setString(3,c.getLname());
		    ps.setString(4,c.getPhNo());
		   
		    int i=ps.executeUpdate();
		    if(i>0)
		    {
		    	return "success";
		    }
		    
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return "";

	}

	@Override
	public void saveTech(TecSupport t) {
		
		Connection conn=null;
		
		try
		{
			String sql="insert into SUPP_REQUESTS values(?,?,?,?,?)";
			conn=DatabaseConnection.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			
		    ps.setInt(1,t.getId());
		    ps.setString(2,t.getEmail());
		    ps.setString(3,t.getSoftware());
		    ps.setString(4,t.getOs());
		    ps.setString(5,t.getProblem());
		    
		    int i=ps.executeUpdate();
		    
		    if(i>0)
		    {
		    	System.out.println("TechSupport saved");
		    }
		    
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		

	}
	
	public boolean checkUser(String email)
	{
		Connection conn=null;
		try
		{
			String sql="select * from customers where email=?";
			conn=DatabaseConnection.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1,email);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				
				return true;
			}
			else
			{
				return false;
			}

		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
				
		return true;
	}
	

	
	@Override
	public Customer getCustomerByEmail(String email) {
		Connection conn=null;
		try
		{
			String sql="select * from customers where email=?";
		conn=DatabaseConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setString(1,email);
		ResultSet rs=ps.executeQuery();
		
			if(rs.next())
			{
				Customer ob=new Customer(rs.getString("fname"),rs.getString("lname"),rs.getString("phone"),rs.getString("email"));
				return ob;
				
			}
		}	
		catch(SQLException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		
		
		
		return null;
	}

	@Override
	public List<TecSupport> getAllRequests() {
		
		Connection conn = null;
		List<TecSupport> reqList=new ArrayList<TecSupport>();
		
		try {
			conn = DatabaseConnection.getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from SUPP_REQUESTS");
			

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				reqList.add(new TecSupport(rs.getInt("REQUEST_ID"),rs.getString("EMAIL"),rs.getString("SOFTWARE"),rs.getString("OS"),rs.getString("PROBLEM")));
			
			} 
			return reqList;

		} catch (SQLException ex) {
			System.out.println(ex);
			
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		
		
		
		return null;
	}

}
