import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no: ");
		int n = sc.nextInt();

		if (n % 3 == 0)
			System.out.println(n + " is divisible by 3");
		else
			System.out.println(n + " is not divisible by 3");
	}
}
