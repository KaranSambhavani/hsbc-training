package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAuthenticar extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		
		if(name.equalsIgnoreCase("Karan") && pass.equalsIgnoreCase("123"))
		{
			out.println("Employee Details......");
			out.println("<h2>Employee Name: "+name+"</h2>");
			//out.println("<h2>Employee pass "+name+"</h2>");
		}
		else
		{
		 	
			response.sendRedirect("login.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
