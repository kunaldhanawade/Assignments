import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileHandling {
	
	public static void write(RandomAccessFile raf) {
		try {
			raf.seek(raf.length());
			System.out.print("Enter a message: ");
			byte writeArr[] = new byte[(int) 100];
			int k = System.in.read(writeArr);
			raf.write(writeArr, 0, k);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void read(RandomAccessFile raf) {
		try {
			raf.seek(0);
			byte readArr[] = new byte[(int) raf.length()];
			raf.read(readArr);
			
			String ss = new String(readArr);
			System.out.println(ss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\file2.txt";
		try {
			RandomAccessFile raf = new RandomAccessFile(path, "rw");

			for(int i=0; i<5; i++) {
				write(raf);
				read(raf);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

