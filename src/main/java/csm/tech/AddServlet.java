package csm.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// service method
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

//		get values from the user
//		parse the string values from user to int
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int result = i + j;
		//System.out.println(result);

		// get the response frm server to client
		 // sharing data btwn servlets-put some data in the request object
		req.setAttribute("result", result);	
		req.setAttribute("i", i);
		req.setAttribute("j", j);
		

		// redirect this output to another servlet
		RequestDispatcher rd = req.getRequestDispatcher("square"); //square is the path/url
		rd.forward(req, res);

	}

}
