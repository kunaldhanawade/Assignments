import java.io.*;

public class Serialization {

	public static void main(String[] args) {
		byte file[] = null;

		File existingFile = new File(
				"C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\existingFile.txt");

		try (FileInputStream fis = new FileInputStream(existingFile)) {
			file = new byte[(int) existingFile.length()];
			fis.read(file);
			System.out.println("File read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File newFile = new File(
				"C:\\Users\\kunal\\OneDrive\\Desktop\\Kunal\\CDAC\\2. Java SE\\Assigns\\forFileHandling\\newFile.txt");

		try (FileOutputStream fos = new FileOutputStream(newFile)) {
			fos.write(file, 0, file.length);
			System.out.println("File written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

