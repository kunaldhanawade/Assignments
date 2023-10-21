import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks: ");
		Double marks = sc.nextDouble();
		
		if(marks>=90)
			System.out.println("distinction");
		else if(marks>=75)
			System.out.println("first class");
		else if(marks>=60)
			System.out.println("second class");
		else if(marks>=35)
			System.out.println("pass");
		else 
			System.out.println("fail");
		
		sc.close();
	}

}
