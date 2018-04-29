<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheet.css" />

<title>Create User</title>
</head>
<header>MIST7570 Dr. Piercy</header>

<body>

<h1>Create a user ID</h1>

<form name=addForm action=addUser method=post>

	<label>
		UserID:
	</label>
	<input type=text name=custUserID value="" />
	<br />
	
	<label>
		Email Address:
	</label>
	<input type=text name=email value="" />
	<br />
	
	<label>
		Password:
	</label>
	<input type=text name=password value="" />
	<br />
	
	<label>
		First Name:
	</label>
	<input type=text name=f_Name value="" />
	<br />
	
	<label>
		Last Name:
	</label>
	<input type=text name=l_Name value="" />
	<br />
	

	
	<input type=submit name=submit value="Add the User" />
</form>
    <Footer>Roberts/Simmons</Footer>

</body>
</html>