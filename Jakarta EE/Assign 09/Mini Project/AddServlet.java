

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Student;
import mypack.StudentDAO;
import mypack.StudentDAODataImpl;
import mypack.StudentDAOFileImpl;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int rno=1;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student stud = new Student();
		StudentDAO sdao;
		PrintWriter out = response.getWriter();
		
		stud.setName(request.getParameter("name"));
		stud.setAddress(request.getParameter("address"));
		
		String storeType = request.getParameter("persistenceStore");
		
		if(storeType.equalsIgnoreCase("file")) {
			stud.setRollno(rno++);
			sdao = new StudentDAOFileImpl();
			sdao.addStudent(stud);
			out.println("Stored in File");
		}
		
		else if (storeType.equalsIgnoreCase("database")) {
			sdao = new StudentDAODataImpl();
			sdao.addStudent(stud);
			out.println("Stored in Database");
		}
		
		else {
			out.println("Invalid Input");
		}
	}

}
