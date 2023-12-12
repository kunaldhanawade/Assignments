package mypack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDAOFileImpl implements StudentDAO {

	@Override
	public void addStudent(Student s) {
		File file = new File("C:\\Users\\kunal\\OneDrive\\Desktop\\myfile.txt");
		try(FileOutputStream fos = new FileOutputStream(file,  true)){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
