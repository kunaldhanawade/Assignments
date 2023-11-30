

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class ViewStudentServ
 */
public class ViewStudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String ss = "jdbc:mysql://localhost:3306/bit";
			con = DriverManager.getConnection(ss, "root", "Kunal@07");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM Student");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				pw.println("Roll No : "+rs.getInt("rollno"));
				pw.println("<br />");
				pw.println("\tName    : " +rs.getString("name"));
				pw.println("<br />");
				pw.println("\tAge     : " +rs.getInt("age"));
				pw.println("<br />");
				pw.println("\tAddress : "+rs.getString("address"));
				pw.println("<br />");
				pw.println("<br />");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
