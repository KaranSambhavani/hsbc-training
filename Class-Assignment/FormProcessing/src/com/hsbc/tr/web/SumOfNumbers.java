package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SumOfNumbers extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try
		{
		
			  int fnum=Integer.parseInt(request.getParameter("fnum"));
				int lnum=Integer.parseInt(request.getParameter("snum"));
				
				int sum=fnum+lnum;
				out.println(String.valueOf(sum));
				
		}
		catch (NumberFormatException e) {
			out.println("Enter valid Numbers");
		}
	  
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
