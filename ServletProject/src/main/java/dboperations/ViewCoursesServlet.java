package dboperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewCoursesServlet extends HttpServlet
{
	
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet2", "root", "1234");
	    		System.out.println(" Database Connection Estlabished ");
	    		PreparedStatement pstmt=con.prepareStatement("select * from course");
	    		ResultSet rs=pstmt.executeQuery();
                out.println(" <style>\r\n"
                		+ "        body{\r\n"
                		+ "            background-color: azure;\r\n"
                		+ "        }\r\n"
                		+ "\r\n"
                		+ "    </style>");
	    		out.println("<h3 align='center'>View Courses</h3>");
	    		out.println("<table align='center' border='1'>");
	    		out.println("<tr bgcolor= 'lightblue'>");
	    		out.println("<td>ID</td>");
	    		out.println(" <td> Course Code</td>");
	    		out.println("<td> Title</td>");
	    		out.println(" <td>Credits</td>");
	    		out.println("<td> LTPS</td>");
	    		out.println("<td>Department</td>");
	    		out.println("</tr>");
	    		while(rs.next()) 
	    		{
	    			out.println("<tr>");
	    			out.println("<td>"+rs.getInt(1)+"</td>");
	    			out.println("<td>"+rs.getString(2)+"</td>");
	    			out.println("<td>" +rs.getString(3)+"</td>");
	    			out.println("<td>" + rs.getDouble(4)+"</td>");
	    			out.println("<td>"+ rs.getString(5)+"</td>");
	    			out.println("<td>" + rs.getString(6)+"</td>");
	    			out.println("</tr>");
	    		}
	    		out.println("</table>");
	    		con.close();
	    		pstmt.close();

		 }
		 catch (Exception e) 
		 {
			out.println(e);
		}
		 
	}

	
}