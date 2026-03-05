package in.ac.kletech;

import java.io.IOException;

public class LoginServlet extends HttpServl {
  
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		HttpSession session=req.getSession();
		
		if("admin".equals(name) && "admin@123".equals(password)) 
		{
			session.setAttribute("Username",name);
			resp.sendRedirect("welocome.jsp");
		}
		else {
			resp.sendRedirect("index.jsp");
		}
	}
	
}
