import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/regForm")
public class RegistrationServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		PrintWriter out=resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","root");
			String sql="insert into users(name,email,password) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			int r=ps.executeUpdate();

		if (r!=0) {
			resp.setContentType("text/html");
		    out.println("<h1 style='color:green'>User Registered Successfully</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("/Form.jsp");
			rd.include(req, resp);
		}	
		else
		{
			resp.setContentType("text/html");
			out.println("<h1 style='color:red'>User Registered Failed</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("/Form.jsp");
			rd.include(req, resp);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
}
}
