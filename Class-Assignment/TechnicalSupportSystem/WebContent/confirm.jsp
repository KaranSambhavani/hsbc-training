<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Service Request received</h1>
<hr>
 <%
    String name=(String)session.getAttribute("name"); %>
    
 <h2>Current User: </h2><%=name %>
 
 <form action="checkUser" method="post">
 
 <input type="submit" name="insert" value="ListAllRequests">
 
 </form>
 
</body>
</html>