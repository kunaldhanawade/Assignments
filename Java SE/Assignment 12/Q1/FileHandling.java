import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char writeArr[] = new char[10];
		for(int i=0; i<10; i++) {
			System.out.print("Enter a character: ");
			writeArr[i] = sc.next().charAt(0);
		}
		
		String path = "C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\file1.txt";
		
		try(FileWriter fw = new FileWriter(path)){
			fw.write(writeArr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char readArr[] = null;
		
		try(FileReader fw = new FileReader(path)){
			readArr = new char[(int) new File(path).length()];
			fw.read(readArr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(char c: readArr) {
			System.out.print(c);
		}
	}
}

