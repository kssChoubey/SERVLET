 package in.kss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet  {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get printwriter
		PrintWriter pw=null;
		pw=res.getWriter();
		//set Response content type
		res.setContentType("text/html");
		//show welcome messagees
		pw.println("<marquee><h1 style='color:red'>Welcome to ProgrammingJack</h1></marfquee>");
		//close stream
		pw.close();
		
	}


}
