package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String itemname=request.getParameter("itemName");
		String price=request.getParameter("itemPrice");
		
		System.out.println(itemname+" "+price);
		
	    HttpSession session=request.getSession(true);
	    session.setAttribute(itemname,price);
	    
		request.getRequestDispatcher("/store_front.jsp").forward(request, response);
	}

}
