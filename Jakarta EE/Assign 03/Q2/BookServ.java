
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

/**
 * Servlet implementation class BookServ
 */
public class BookServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;

	@Resource(lookup = "java:/comp/env/mypool")
	DataSource ds;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM books");

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			while (rs.next()) {
				out.println("Book Id: " + rs.getInt(1));
				out.println("<br>");
				out.println("Book Name: " + rs.getString(2));
				out.println("<br>");
				out.println("Book Author: " + rs.getString(3));
				out.println("<br>");
				out.println("Book Price: " + rs.getDouble(4));
				out.println("<br><br>");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
