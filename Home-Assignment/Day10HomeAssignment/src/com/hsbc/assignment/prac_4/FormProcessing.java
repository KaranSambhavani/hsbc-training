package com.hsbc.assignment.prac_4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Karan
 *
 */
public class FormProcessing extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		
		out.println("Employee Details......");
		out.println("<h2>Employee Name "+name+"</h2>");
		out.println("<h2>Employee email "+email+"</h2>");
		
	}

}
