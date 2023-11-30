import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.sql.ResultSetMetaData;

public class Second {

	public static void main(String[] args) {
		String ss = "jdbc:mysql://localhost:3306/bit";
		
		try(Connection con = DriverManager.getConnection(ss, "root", "Kunal@07")){
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM Employee WHERE desig=?");
			pst.setString(1, "FS Developer");
			ResultSet rs = pst.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			
			while(rs.next()) {
				for(int i=1; i<=count; i++) {
					System.out.print(rsmd.getColumnName(i)+": "+rs.getObject(i)+" ");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
