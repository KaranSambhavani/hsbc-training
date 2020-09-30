package com.hsbc.assignment.prac_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>This is Servlet s1</h2>");
		
		String mode=request.getParameter("mode");
		
		switch (mode) {
		case "forward":
			request.getRequestDispatcher("S2").forward(request, response); 
			break;
        
		case "include":
			request.getRequestDispatcher("/S3").include(request, response); 
			break;
			
		default:
			response.sendRedirect("http://www.google.com");
			break;
		}
		
		
	}

}
