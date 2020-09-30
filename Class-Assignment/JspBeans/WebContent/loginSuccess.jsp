<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 <%= "Login Sussessfull "+request.getParameter("userName") %>
 <br>
 
 <form method="post" action="view.jsp">
 <input type="submit" value="List Users">
 
 </form>
</body>
</html>