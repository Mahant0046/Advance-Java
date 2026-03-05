<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Online Calculator</title>
</head>
<body>
    <h2>Simple Online Calculator</h2>
    <form method="post">
        <label>Number 1:</label>
        <input type="number" name="num1" required><br><br>

        <label>Number 2:</label>
        <input type="number" name="num2" required><br><br>

        <label>Operation:</label>
        <select name="operation">
            <option value="Add">Add</option>
            <option value="Subtract">Subtract</option>
            <option value="Multiply">Multiply</option>
            <option value="Divide">Divide</option>
        </select><br><br>

        <input type="submit" value="Calculate">
    </form>

    <%
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if(num1Str != null && num2Str != null && operation != null){
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                double result = 0;
                String opSymbol = "";

                switch(operation) {
                    case "Add":
                        result = num1 + num2;
                        opSymbol = "+";
                        break;
                    case "Subtract":
                        result = num1 - num2;
                        opSymbol = "-";
                        break;
                    case "Multiply":
                        result = num1 * num2;
                        opSymbol = "*";
                        break;
                    case "Divide":
                        if(num2 != 0) {
                            result = num1 / num2;
                            opSymbol = "/";
                        } else {
                            out.println("<h3 style='color:red;'>Error: Division by zero is not allowed.</h3>");
                            return;
                        }
                        break;
                }
                out.println("<h3>Result: " + num1 + " " + opSymbol + " " + num2 + " = " + result + "</h3>");
            } catch(NumberFormatException e) {
                out.println("<h3 style='color:red;'>Invalid input. Please enter valid numbers.</h3>");
            }
        }
    %>
</body>
</html>
