<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
	<h1 style='color:green'>Welcome ${Name} </h1>
	<form action="addtask" method="post">
		<label>Enter title</label><br>
		<input type="text" name="todo">
		<input type="submit" name="opertion" value="ADD TASK">
	</form>
	
</body>
</html>