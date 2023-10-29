import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\file3.txt";
		File f = new File(path);
		
		char c[] = null;
		
		try(FileReader fr = new FileReader(f)) {
			c = new char[(int) f.length()];
			fr.read(c);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path1 = "C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\file4.txt";
		File fcpy = new File(path1);
		
		try(FileWriter fw = new FileWriter(fcpy)){
			fw.write(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

