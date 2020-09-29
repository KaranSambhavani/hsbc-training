package com.hsbc.assignment.prac_3;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Karan
 *
 */
public class Methods extends HttpServlet {
	
   
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Init Called...");
	}

	
	public void destroy() {
		System.out.println("Destroy Called...");
	}

	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet Called.....");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoPost Called.....");
	}

}
