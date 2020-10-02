package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		
		out.println("Name "+config.getInitParameter("name"));
		out.println("Driver "+context.getInitParameter("driver"));
		
		
		
		out.println("<h2>This is Servlet s1</h2>");
		String mode=request.getParameter("mode");
		
		switch(mode)
		{
		case "forward":
			  RequestDispatcher rd=request.getRequestDispatcher("/s2");
		      rd.forward(request, response);
		      break;
		               
		case "include":
			 RequestDispatcher rd1=request.getRequestDispatcher("/s3");
			 rd1.include(request, response);
			 break;
		
		case "redirect":
			 response.sendRedirect("s3");	
			 break;
		
		default:
			out.print("Enter valid Input");				
						
		 
		
		}
		
		
		
	}

}
