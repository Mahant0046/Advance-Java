<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<form action="regForm" method="post">  
		Name:<input type="text" name="name"><br><br>
		Email:<input type="email" name="email" name="email"><br><br>
		Password:<input type="password" name="pass"><br><br>
		/* Gender: <input type="radio" value="Male" name="gender" > Male<input type="radio" value="Female" name="gender">Female<br><br>
		city: <select name="city">
			<option value="Hubli">Hubli</option>
			<option value="Dharwad">Dharwad</option>
			<option value="Gadag">Gadag</option>
			<option value="Banglore">Banglore</option>
		</select><br><br>  */
		<input type="submit" value="submit">
	</form>
</body>
</html>