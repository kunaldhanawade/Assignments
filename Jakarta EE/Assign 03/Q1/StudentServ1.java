
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * Servlet implementation class StudentServ1
 */
public class StudentServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	
	@Resource(lookup = "java:/comp/env/mypool")
	DataSource ds;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			con=ds.getConnection();
			PreparedStatement pst = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?, ?)");
			pst.setInt(1, Integer.parseInt(request.getParameter("roll").trim()));
			pst.setString(2, request.getParameter("name"));
			pst.setInt(3, Integer.parseInt(request.getParameter("age").trim()));
			pst.setString(4, request.getParameter("address"));
			int uc = pst.executeUpdate();

			PrintWriter pw = response.getWriter();
			if (uc > 0)
				pw.println("Record Inserted Successfully");
			else
				pw.println("Could not Process your Request");
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
