package dboperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCourseServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 
		int cid = (int)(Math.random()*9999)+1;
		 String ccode=request.getParameter("coursecode");
		 String ctitle=request.getParameter("coursetitle");
		 double credits=Double.parseDouble(request.getParameter("credits"));
		 String ltps=request.getParameter("ltps");
		 String dept=request.getParameter("department");
		 
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet2", "root", "1234");
	    		System.out.println(" Database Connection Estlabished ");
	    		PreparedStatement pstmt=con.prepareStatement("insert into course values(?,?,?,?,?,?)");
	    		pstmt.setInt(1, cid);
	    		pstmt.setString(2, ccode);
	    		pstmt.setString(3, ctitle);
	    		pstmt.setDouble(4, credits);
	    		pstmt.setString(5, ltps);
	    		pstmt.setString(6, dept);
	    		pstmt.executeUpdate();
	    		con.close();
	    		pstmt.close();
	    		response.sendRedirect("coursesuccess.html");
		 }
		 catch (Exception e) 
		 {
			out.println(e);
		}
		 
	}

	
}