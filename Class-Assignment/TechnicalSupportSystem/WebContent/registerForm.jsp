<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Customer Registeration</h1>
<hr>


  <form action="checkUser" method="post">
  
   First Name: <input type="text" name="fname"><br>
   <br>
   Last Name: <input type="text" name="lname"><br>
   <br>
   Phone Number: <input type="text" name="phno"><br>
   <br>
   Email: <input type="text" name="email"><br>
   <br>
   <input type="submit" name="insert" value="register">
   
   </form>
</body>
</html>