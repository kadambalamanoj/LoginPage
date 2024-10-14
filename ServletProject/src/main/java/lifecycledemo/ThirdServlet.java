package lifecycledemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ThirdServlet implements Servlet
{
      ServletConfig sconfig=null;
      
	@Override
	//lifecycle
	public void destroy() 
	{
         System.out.println("Servlet is Destroyed");
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		
		return sconfig;
	}

	@Override
	public String getServletInfo() 
	{
		return "Author:KLU Version:1.0";
	}

	@Override
//	lifecycle
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet is initialized");
		this.sconfig=config;
		System.out.println("Servlet Name="+sconfig.getServletName());
	}
	@Override
//	lifecycle
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("I am in Service method");
		 res.setContentType("text/html");
		 PrintWriter out =res.getWriter();//explicit object
		 out.println("<b>Servlet Life Cycle Demo using Servlet Interface</b>");
	}

	
	
}