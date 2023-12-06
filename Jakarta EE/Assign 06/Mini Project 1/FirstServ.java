

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class FirstServ
 */
public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	
	@Resource(lookup = "java:/comp/env/mypool")
	DataSource ds;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<String> pnames = new ArrayList<String>();
			con=ds.getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT pname FROM products");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				pnames.add(rs.getString("pname"));
			}
			con.close();
			request.setAttribute("pnames", pnames);
			RequestDispatcher rd = request.getRequestDispatcher("Shop.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		}
	}

}
