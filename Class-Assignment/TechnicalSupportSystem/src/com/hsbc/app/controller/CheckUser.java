package com.hsbc.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.app.dao.AppDao;
import com.hsbc.app.dao.AppDaoImpl;
import com.hsbc.app.model.Customer;
import com.hsbc.app.model.TecSupport;
import com.hsbc.app.service.TechService;

/**
 * 
 * @author Karan
 *
 */
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AppDao dao=new AppDaoImpl();
	TechService service=new TechService(dao);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("insert").equals("submit")) {
			
			Random rand = new Random(); 
			int id = rand.nextInt(1000);
			String email=request.getParameter("email");
			String software=request.getParameter("software");
			String os=request.getParameter("os");
			String problem=request.getParameter("problem");
			
			boolean validUser=service.validateUser(email);
			
			if(validUser)
			{
				TecSupport ts=new TecSupport(id, email, software, os, problem);
				service.registerComplaint(ts);
				
				Customer ob=service.getCustomerByEmail(email);
				HttpSession session=request.getSession(true);
				session.setAttribute("name",ob.getFname()+" "+ob.getLname());
				
				request.getRequestDispatcher("/confirm.jsp").forward(request, response);
				
				
			}
			else
			{
				TecSupport ob=new TecSupport(id, email, software, os, problem);
				HttpSession session=request.getSession(true);
				session.setAttribute("TecOb",ob);
				
				request.getRequestDispatcher("/registerForm.jsp").forward(request, response);
			}
			
		}
		
		
		else if(request.getParameter("insert").equals("register")) {
			
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String phno=request.getParameter("phno");
			String email=request.getParameter("email");
			
			Customer c=new Customer(fname, lname, phno, email);
			
			boolean IsCustomerSaved=service.registerUser(c);
		
			if(IsCustomerSaved) {
				
				HttpSession session=request.getSession(false);
				TecSupport ob=(TecSupport)session.getAttribute("TecOb");
				service.registerComplaint(ob);
				

				HttpSession session1=request.getSession(true);
				session1.setAttribute("name",c.getFname()+" "+c.getLname());
				 
				
				request.getRequestDispatcher("/confirm.jsp").forward(request, response);
			
			}
			
			
		}
		else if(request.getParameter("insert").equals("ListAllRequests"))
		{
			request.getSession(true).setAttribute("requests",service.listAll());
			request.getRequestDispatcher("/show.jsp").forward(request, response);
		}
		
	}

}
