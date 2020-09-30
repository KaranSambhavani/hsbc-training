<%@page import="com.hsbc.tr.web.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <jsp:useBean id="user" class="com.hsbc.tr.web.User" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  
 <table>
 
   <tr>
     <td>Names Of the Users</td>
    </tr> 
    
    
  <%
	  User u=(User)session.getAttribute("user");
       
	 
	  for(String s:u.getUsers())
	  {
	
  %>	  
      <tr>
        <td><%=s%></td>
      </tr>
  <% 
    }
  
  %>
 
 </table> 
</body>
</html>