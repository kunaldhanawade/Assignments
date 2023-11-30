import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.sql.ResultSetMetaData;

public class Third {

	public static void main(String[] args) {
		Product p = new Product(1, 69, 1000, "Hot Wheels");

		System.out.println("Current Object: "+p);

		String ss = "jdbc:mysql://localhost:3306/bit";

		try (Connection con = DriverManager.getConnection(ss, "root", "Kunal@07")) {

			PreparedStatement pst = con.prepareStatement("INSERT INTO Product VALUES (?, ?, ?, ?)");
			pst.setInt(1, p.getPid());
			pst.setInt(2, p.getQty());
			pst.setDouble(3, p.getCost());
			pst.setString(4, p.getPname());
			int count = pst.executeUpdate();

			if (count > 0)
				System.out.println(count + " records inserted successfully");
			else
				System.out.println("unable to process your request t the moment");

			p = null;

			pst = con.prepareStatement("SELECT * FROM Product WHERE pid=?");
			pst.setInt(1, 1);
			ResultSet rs = pst.executeQuery();

			rs.next();
			
			Product p2 = new Product(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getString(4));
			
			System.out.println("\nNew Object: "+p2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
