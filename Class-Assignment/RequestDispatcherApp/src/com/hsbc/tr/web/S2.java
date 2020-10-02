package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		
		out.println("Name "+config.getInitParameter("name"));
		out.println("Driver "+context.getInitParameter("driver"));
		
		
		
		out.println("<h2>This is Servlet s2</h2>");
		
		out.println("<h2>Request Forwarded here</h2>");
		
	}

}
