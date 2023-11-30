

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
import java.sql.SQLException;

/**
 * Servlet implementation class AddStudentServ
 */
public class AddStudentServ extends HttpServlet {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO Student (name, age, address) VALUES (?,?,?)");
			
			pst.setString(1, request.getParameter("name"));
			pst.setInt(2, Integer.parseInt(request.getParameter("age").trim()));
			pst.setString(3, request.getParameter("address"));
			
			int res = pst.executeUpdate();
			
			if(res>0)
				pw.println(res + " record inserted successfully");
			else
				pw.println("ERROR");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
