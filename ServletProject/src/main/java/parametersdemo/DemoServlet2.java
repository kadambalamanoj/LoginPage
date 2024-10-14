package parametersdemo;

import java.applet.AppletContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//init and context parameters
public class DemoServlet2 extends  HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 System.out.println("I am in Service method");
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		  
		 out.println("<b> I am in Demo Servlet 2 </b><br>");
		 out.println("<br>");


		 ServletConfig config=getServletConfig();
		 out.println("<b> Demo Servlet 1 init parameter</b>");
		 out.println("<br>");

		 out.println("ID="+config.getInitParameter("id"));
		 out.println("<br>");

		 out.println("NAME="+config.getInitParameter("name"));
		 out.println("<br>");

		 
		 out.println("<b> Demo Servlet 2 init parameter</b>");
		 out.println("<br>");

		 out.println("USERNAME="+config.getInitParameter("username"));
		 out.println("<br>");

		 out.println("Password="+config.getInitParameter("password"));
		 out.println("<br>");

		 
		 ServletContext context=getServletContext();
		 out.println("<b> Demo Servlet 1 context parameter</b>");
		 out.println("<br>");

		 out.println("college="+context.getInitParameter("college"));
		 out.println("<br>");

		 out.println("section="+context.getInitParameter("section"));
		 
	}
}
