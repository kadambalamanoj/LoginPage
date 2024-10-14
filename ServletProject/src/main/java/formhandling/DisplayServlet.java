package formhandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 out.println("<b> Form Handling using POST method</b> <br>");

		 String eid=request.getParameter("id");
		 String ename=request.getParameter("name");

		 String eage=request.getParameter("age");

		 String egender=request.getParameter("gender");
		 out.println("Eployee ID="+eid+"<br>");
		 out.println("Eployee name="+ename+"<br>");
		 out.println("Eployee Age="+eage+"<br>");
		 out.println("Eployee Gender="+egender+"<br>");


	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 out.println("<b> Form Handling using GET method</b> <br>");

		 String eid=request.getParameter("id");
		 String ename=request.getParameter("name");

		 String eage=request.getParameter("age");

		 String egender=request.getParameter("gender");
		 out.println("Eployee ID="+eid+"<br>");
		 out.println("Eployee name="+ename+"<br>");
		 out.println("Eployee Age="+eage+"<br>");
		 out.println("Eployee Gender="+egender+"<br>");


	}
}
