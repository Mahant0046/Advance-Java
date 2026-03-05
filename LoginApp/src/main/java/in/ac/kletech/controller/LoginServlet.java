package in.ac.kletech.controller;

import in.ac.kletech.bean.LoginBean;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set bean values
        LoginBean bean = new LoginBean();
        bean.setUsername(username);
        bean.setPassword(password);

        // Validate
        if (bean.validate()) {
            request.setAttribute("user", username);
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
}
