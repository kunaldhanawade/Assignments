import java.io.*;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\file5.txt";
		File f = new File(path);

		try (FileOutputStream fos = new FileOutputStream(f)) {
			try (DataOutputStream dos = new DataOutputStream(fos)) {
				int i=1;
				int k;
				System.out.println("Enter numbers below, 0 to quit");
				while (true) {
					System.out.print("Enter the num at "+(i++)+":\t");
					k = sc.nextInt();
					if(k==0)
						break;
					dos.writeInt(k);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(f)) {
			try (DataInputStream dis = new DataInputStream(fis)) {
				System.out.println("The numbers are");
				while (dis.available() != 0) {
					System.out.print(dis.readInt()+"\t");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

