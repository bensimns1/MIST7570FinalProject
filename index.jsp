<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheet.css" />

<title>7570 Final</title>
</head>

<body>

<h1>Login to the site</h1>
<form name=addForm action=validateUser method=post>
	<label>
		UserID:
	</label>
	<input type=text name=custUserID value="" />
	<br />
	
	<label>
		Password:
	</label>
	<input type=text name=password value="" />
	<br />
 	<input type=submit name=submit value="Login" />
 </form>
 <p>
  <a href="register.jsp">Click here to register as a new user</a>
</p>
<img src="Images/HomePagePic.jpg" height="400" width= "500">
</body>

</html>

