<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <form action="checkUser" method="post">
   
   <h1>Technical Support Request</h1>
   <hr>
   
   Email: <input type="text" name="email"><br>
   <br>
   Software:<select name="software">
             
             <option>Microsoft Word</option>
             <option>Abc</option>
             <option>PQr</option>
             <option>XYz</option>
          </select> <br>
   <br>
   Operating system:<select name="os">
             
             <option>Windows</option>
             <option>Linux</option>
             <option>unix</option>
             
          </select> <br>
      <br>    
   Problem: <input type="text" name="problem"><br>
   
   <br>
   <input type="submit" name="insert" value="submit">
   
   
  
  </form>

   
</body>
</html>