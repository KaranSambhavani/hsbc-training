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
  <hr>
  <form action="shoppingCart" method="post">
  
	  Item Name: <input type="text" name="itemName"/><br>
	  Item Price: <input type="text" name="itemPrice"/><br>
	  
	  <input type="submit" value="Add Item">
   
  </form>
  <br>
  <br>
  <a href="view_cart.jsp">View Cart</a>

</body>
</html>