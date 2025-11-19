package csm.tech;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	// service method
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

//		get values from the user
//		parse the string values from user to int
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int result = i + j;

		/*
		 *1. **USING REQUEST DISPATCHER // get the response frm server to client //
		 * sharing data btwn servlets-put some data in the request object
		 * req.setAttribute("result", result);
		 *  req.setAttribute("i", i);
		 * req.setAttribute("j", j);
		 * 
		 * 
		 * // redirect this output to another servlet 
		 * RequestDispatcher rd = req.getRequestDispatcher("square"); //square is the path/url
		 *  rd.forward(req,res);
		 */
		
		 /* 2. **USING SEND REDIRECT 
		 * servlet sends a response to client to re direct it to another url hence we use res
		 *  res.sendRedirect("square?result="+result); //- url rewriting
		 */
		// 3. USING SESSIONS
		/*
		 * HttpSession session = req.getSession();
		 * System.out.println("session id: "+session.getId());
		 * 
		 * session.setAttribute("result",result);
		 *  res.sendRedirect("square"); // here cz of res, AddServlet/server redirects response to another servlet, Square
		 */	
		
//		USING COOKIES
		// create a new cookie
		Cookie cookie = new Cookie("result", result+"");  //int appended "" becomes a String
		// add cookie to the response obj that goes to the client
		res.addCookie(cookie);
		res.sendRedirect("square");  //client now sends cookie(res) to another server
		
		
	
		
		
		
	}

}
