package lifecycledemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SecondServlet extends GenericServlet 
{
	public void init()
	{
		System.out.println("Servlet is Initialized");
	}
	 
	public void service(ServletRequest request,ServletResponse response )  throws IOException,ServerException
	{
		System.out.println("I am in Service method");
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();//explicit object
		 out.println("<b>Servlet Life Cycle Demo using Generic Servlet</b>");
	}
	public void destroy() 
	{
		System.out.println("Servlet is Destroyed");
	}
}