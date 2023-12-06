

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> mylist = new ArrayList<String>();
		mylist.add("Kunal");
		mylist.add("Vedant");
		mylist.add("Yash");
		mylist.add("Shubham");
		mylist.add("Mayuri");
		mylist.add("Vardhaman");
		mylist.add("Divyanshu");
		mylist.add("Swapnil");
		mylist.add("Obaid");
		
		HttpSession session = request.getSession();
		session.setAttribute("grp03", mylist);
		
		PrintWriter out = response.getWriter();
		out.println("Session has been created");
	}

}
