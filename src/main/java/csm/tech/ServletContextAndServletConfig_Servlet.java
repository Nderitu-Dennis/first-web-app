package csm.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAndServletConfig_Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		get the values config & context
//		ServletContext
		PrintWriter out= res.getWriter();
		
//		call a context object
		/*
		 * ServletContext ctx = req.getServletContext();
		 * 
		 * String name=ctx.getInitParameter("name"); out.println(name);
		 * 
		 * out.println(ctx.getInitParameter("status"));
		 */
		
//	   using ServletConfiguration
		ServletConfig cfg = getServletConfig();
		out.println(cfg.getInitParameter("name"));
				
		
	}

}
