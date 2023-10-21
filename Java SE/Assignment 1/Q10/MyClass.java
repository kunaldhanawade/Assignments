import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no 1: ");
		int a = sc.nextInt();
		System.out.println("Enter no 2: ");
		int b = sc.nextInt();

		System.out.println("Subtraction: " + (a - b));
	}
}
