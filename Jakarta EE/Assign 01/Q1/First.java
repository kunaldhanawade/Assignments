import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {
		String ss = "jdbc:mysql://localhost:3306/bit";
		
		try(Connection con = DriverManager.getConnection(ss, "root", "Kunal@07")){
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)");
			pst.setInt(1, 1);
			pst.setString(2, "Kunal Dhanawade");
			pst.setInt(3, 23);
			
			int count = pst.executeUpdate();
			
			if (count>0)
				System.out.println(count+" record inserted");
			else
				System.out.println("Unable to process request at the moment");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Student");
			
			while(rs.next()) {
				int roll = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				
				System.out.println("Roll No: "+roll+" Name: "+name+" Age: "+age);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
