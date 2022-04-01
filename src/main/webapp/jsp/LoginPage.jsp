<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Login Page</title>
<header>
<link rel="stylesheet" type="text/css" href="css/myStyle.css">
</header>
<body>
<br><br>
<h2>Login page</h2>
<br>
<form method="post" action="NewUserRegistration">
<label for="fname">First Name:</label>&nbsp;
<input type="text" id="fname" name="fname"><br><br>
<label for="lname">Last Name:</label>&nbsp;
<input type="text" id="lname" name="lname"><br><br>
<label for="pwd">Password:</label>&nbsp;&nbsp;&nbsp;
<input type="password" id="pwd" name="pwd"><br><br>
<div class="container"><input type="submit" value="Submit"><br><br></div>
<div>Sign up for the new user:&nbsp;
<a href="http://localhost:8080/List/jsp/NewUserRegistrationPage.jsp" target="_blank">SignUp</a></div>
</form>

</body>
</html>