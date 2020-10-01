<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Front</title>
</head>
<body>
  
  <h1 style="color:blue">Everyday Shopping experience</h1>
  <h1 style="color:blue" align="center">Cart Items</h1>
  <hr>
  
  <p>Cart Item Available here</p>

  <%
     
    if(session!=null)
    {
    	Enumeration<String> sessionEnum=session.getAttributeNames();
    
   
  %>
	  <table>
	    <tr>
	     <th>Item Name</th>
	     <th>item Price</th>
	    </tr>
	    
	    <%
	     
	    while(sessionEnum.hasMoreElements())
	    {
	    	String name=sessionEnum.nextElement();
	    %>
	       <tr>
		     <td><%=name %></td>
		     <td><%=(String)session.getAttribute(name) %></td>
	       </tr>
	    
	    <%}%>
	  
	  </table>
	  
   <%}
    else
    {
    
    %>
    <h2>No Items Available</h2>
    <%} %>
    
</body>
</html>