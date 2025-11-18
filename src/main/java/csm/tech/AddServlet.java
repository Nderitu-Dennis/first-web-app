package csm.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// service method
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		get values from the user
//		parse the string values from user to int
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int result = i + j;
		
		//get the response frm server to client
		PrintWriter out = res.getWriter();
		out.println("result: "+ result);

	}

}
