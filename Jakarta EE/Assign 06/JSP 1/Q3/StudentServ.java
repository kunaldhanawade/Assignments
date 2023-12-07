

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
 * Servlet implementation class StudentServ
 */
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	
	@Resource(lookup = "java:/comp/env/mypool")
	DataSource ds;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Integer> mylist = new ArrayList<Integer>();
			
			con=ds.getConnection();
			PreparedStatement pst = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?, ?)");
			pst.setInt(1, Integer.parseInt(request.getParameter("rollno").trim()));
			pst.setString(2, request.getParameter("name"));
			pst.setInt(3, Integer.parseInt(request.getParameter("age").trim()));
			pst.setString(4, request.getParameter("address"));
			int  uc = pst.executeUpdate();
			
			pst = con.prepareStatement("SELECT rollno FROM student");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				mylist.add(rs.getInt(1));
			}
			con.close();
			
			request.setAttribute("rollnos", mylist);
			
			RequestDispatcher rd = request.getRequestDispatcher("Report.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
