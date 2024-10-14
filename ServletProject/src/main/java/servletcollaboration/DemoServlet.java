package servletcollaboration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();  //explicit object
		
		out.println("<b>I am in Demo Servlet</b><br>");//this is the present output if we use forward method it will not diaplay
//		
//		RequestDispatcher rd = request.getRequestDispatcher("demo1"); // servlet resourse
//		rd.forward(request, response);
		
//		RequestDispatcher rd = request.getRequestDispatcher("index.html"); // html resourse
//		rd.forward(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("demo2"); //  servlet resourse
		rd.include(request, response);
		
		//RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); //jsp resourse
		//rd.include(request, response);
		
		//response.sendRedirect("demo1"); //servlet resourse
		
//		response.sendRedirect("index.html"); //html resourse
		
//		response.sendRedirect("https://www.linkedin.com/in/manoj-kadambala/"); //URL              
		
//		response.sendRedirect("https://www.google.com/search?gs_ssp=eJzj4tTP1TdIqrQ0yzVg9OLJzinNyyxLLSrOLKkEAGNOCIY&q=kluniversity&oq=kluniversity");
		



		
	}
}