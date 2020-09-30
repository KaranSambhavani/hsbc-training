<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <%
      String name=request.getParameter("username");
       String pass=request.getParameter("pass");
    
        if(name.equalsIgnoreCase("Karan") && pass.equalsIgnoreCase("123"))
        {
        	
        ArrayList<String> users=new ArrayList<String>();
        users.add("Karan");
        users.add("Ravi");
        users.add("Keval");
        users.add("Mosam");
        users.add("Keta");
        session.setAttribute("Users",users);
        
      %>
        <jsp:forward page="loginSuccess.jsp"/>
      
      <%     	
        }
        else
        {
       %>
       
         <jsp:forward page="loginFailure.jsp"></jsp:forward> 
       <%  	
        }
    
       %>


</body>
</html>