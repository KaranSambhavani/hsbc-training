package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcessForm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String id=request.getParameter("empId");
		String name=request.getParameter("username");
		String city=request.getParameter("city");
		String salary=request.getParameter("salary");
		
		out.println("Employee Details......");
		out.println("<h2>Employee Id "+id+"</h2>");
		out.println("<h2>Employee Name "+name+"</h2>");
		out.println("<h2>Employee City "+city+"</h2>");
		out.println("<h2>Employee Salary "+salary+"</h2>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
