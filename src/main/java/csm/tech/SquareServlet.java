package csm.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	// create a get method -will send a request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/*
		 * // fetching the attributes from AddServlet int result = (int)
		 * req.getAttribute("result");
		 *  int i = (int) req.getAttribute("i");
		 * int j = (int) req.getAttribute("j");
		 * 
		 * result = result * result; 
		 * PrintWriter out = res.getWriter();
		 * out.println("square of " + i + " and " + j + " is: " + result);
		 */

//		USING RE DIRECTS
		int result = Integer.parseInt(req.getParameter("result"));
		result = result * result;
		PrintWriter out = res.getWriter();
		out.println("result is " + result);

	}
}
