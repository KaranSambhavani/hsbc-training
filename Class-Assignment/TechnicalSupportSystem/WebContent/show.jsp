<%@page import="com.hsbc.app.model.TecSupport"%>
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

  <h1>All Requests:</h1>
  <hr>
  
  <% 
    ArrayList<TecSupport> as=(ArrayList<TecSupport>)session.getAttribute("requests");
  
    for(TecSupport ob:as)
    {
   
  %>
    <%=ob %>
    <br>
     
  <%} %>
</body>
</html>