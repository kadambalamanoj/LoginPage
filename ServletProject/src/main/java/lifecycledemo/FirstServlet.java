package lifecycledemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	
	public void init()
	{
		System.out.println("Servlet is Initialized");
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServerException
	{
		 System.out.println("I am in Service method");
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 out.println("<b>Servlet Life Cycle Demo using Http Servlet </b>");
	}
	public void destroy() 
	{
		System.out.println("Servlet is Destroyed");
	}
}