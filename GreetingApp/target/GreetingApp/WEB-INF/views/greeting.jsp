<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Greeting Form</title>
</head>
<body>
    <h2>Enter your name</h2>
    <form action="greet" method="post">
        <input type="text" name="name" required />
        <input type="submit" value="Greet Me!" />
    </form>
</body>
</html>
