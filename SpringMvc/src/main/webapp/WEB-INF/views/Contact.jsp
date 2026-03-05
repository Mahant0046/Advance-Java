<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="handleForm" method="post">
 
 	<div >
 	
 	<h1>${AppName}</h1>
 	<label>Email </label>
 	<input type="email" name="email"><br><br>
 	<label>UserName </label>
 	<input type="text" name="name"><br><br>
 	<label>Password </label>
 	<input type="password" name="password"><br><br>
 	<input type="submit" value="SUBMIT">
 	</div>
 
 </form>

</body>
</html>