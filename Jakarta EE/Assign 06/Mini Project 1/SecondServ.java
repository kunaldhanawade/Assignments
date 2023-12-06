

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class SecondServ
 */
public class SecondServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] pnames = request.getParameterValues("ck");
		
		List<String> mylist = new ArrayList<String>();
		for (String str : pnames) {
			mylist.add(str);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("plist", mylist);
		
		response.sendRedirect("Bill.jsp");
	}

}
