package csm.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	// create a get method -will send a request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/* USING REQUEST DISPATCHER
		 * // fetching the attributes from AddServlet
		 *  int result = (int)  req.getAttribute("result");
		 *  int i = (int) req.getAttribute("i");
		 * int j = (int) req.getAttribute("j");
		 * 
		 * result = result * result; 
		 * PrintWriter out = res.getWriter();
		 * out.println("--from req dispatcher--square of " + i + " and " + j + " is: " + result);
		 */

//		USING RE DIRECTS
		/* int result = Integer.parseInt(req.getParameter("result"));
		result = result * result;
		PrintWriter out = res.getWriter();
		out.println("--from url rewrite--result is " + result); */
		
//		USING SESSIONS
		// fetch the value from AddServlet, declare session first
		/*HttpSession session = req.getSession();
		int result = (int) session.getAttribute("result");
		result = result * result;
		
		PrintWriter out = res.getWriter();
		out.println("--from session-- result is: " + result); */
		
//		USING COOKIES
		//extract cookie-comes as a request to this square server so we use req 
		int result =0;
		Cookie cookies[] = req.getCookies();  
		
		for(Cookie c : cookies) {
			if(c.getName().equals("result"))
				result=Integer.parseInt(c.getValue());
		}
		
		result = result * result;
		PrintWriter out = res.getWriter();
		out.println("--from cookie-- result is: " + result); 
		
					
					
		

	}
}
