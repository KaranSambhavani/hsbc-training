package com.hsbc.assignment.challenge;

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
public class MethematicOperation extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try
		{
			  int fnum=Integer.parseInt(request.getParameter("fnum"));
		      int lnum=Integer.parseInt(request.getParameter("snum"));
		      
		      if(request.getParameter("submit").equalsIgnoreCase("add"))
		      {
		    		int sum=fnum+lnum;
					out.println(String.valueOf(sum));
					
		      }
		      else if(request.getParameter("submit").equalsIgnoreCase("multiply"))
		      {
		    	    int ans=fnum*lnum;
					out.println(String.valueOf(ans));  
		      }
		      else if(request.getParameter("submit").equalsIgnoreCase("devide"))
		      {
		    	  try
		    	  {
		    		  int ans=fnum/lnum;
					  out.println(String.valueOf(ans));  
		    	  }
		    	  catch (ArithmeticException e) {
					 out.println("Cannot devide number by 0");
				  }
		    	      
		      }
		      else
		      {
		    	     int ans=fnum-lnum;
					out.println(String.valueOf(ans));
		      }
				
			
		}
		catch (NumberFormatException e) {
			out.println("Enter valid Numbers");
		}
	  
		
		
		
	}

}
