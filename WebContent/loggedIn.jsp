<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%

	  // get the inputs from the session attributes
  	String custUserID = (String) session.getAttribute("custUserID");
  	String email = (String) session.getAttribute("email");	
  	String f_name = (String) session.getAttribute("f_name");	
  	String l_name = (String) session.getAttribute("l_name");	
	  
  // output the form to the client
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Works</title>
</head>
<body>
	<h1>Login Works</h1>

<p>
	Hey, It Worked! Check details below to see if they match.
</p>
	<label>User Name:</label>
	<%= custUserID %>
	<label>Email:</label>
	<%= email %>
		<label>First Name:</label>
	<%= f_name %>
		<label>Last Name:</label>
	<%= l_name %>
     

</body>
</html>