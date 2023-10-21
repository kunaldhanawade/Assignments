import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no 1: ");
		int a = sc.nextInt();
		System.out.println("Enter no 2: ");
		int b = sc.nextInt();

		if (a == b)
			System.out.print("equal");
		else if (a > b)
			System.out.println("no 1 is greater");
		else
			System.out.println("no 2 is greater");
	}
}
