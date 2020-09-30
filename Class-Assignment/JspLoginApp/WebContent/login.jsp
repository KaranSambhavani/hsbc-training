<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Login Page</h2>
    <hr>
   <form action="Authenticar.jsp" method="post">
   
      <table>
          <tr>
            <td>UserName</td>
            <td><input type="text" name="username"></td>
          </tr>
			
		 <tr>
            <td>Password</td>
            <td><input type="text" name="pass"></td>
          </tr>
				
          <tr>
            <td colspan="2"><input type="submit" name="submit" value="login"></td>
          </tr>
      </table>
   
   </form>
   
   
</body>
</html>