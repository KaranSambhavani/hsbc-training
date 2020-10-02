<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tags Demo</title>
</head>
<body>

<%-- Declaration tags puts code outside _jspService() --%>
 <%!
   String fname="Karan";
   String lname="Sambhavani";
   
   public String concate(String s1,String s2)
   {
	   return s1+" "+s2;
   }
 %>
 
 <%--Expression tag Puts code inside out.print() in _jspservce() --%>
  
  <%="Expression_tags" %><br>
  
   <%=(fname+" "+lname) %><br>
   
   <%= concate(fname,lname) %>
    

  <%--Scriplet tag put code inside _jspService() --%>
  
    <%out.println("Scriptlet tags"); %>
    <% out.println(fname+" "+lname); %>
    
    <%out.println(new Date()) ;%>
    
    
    
    
      
</body>
</html>