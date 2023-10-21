public class MyClass2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int s = i; s < 5; s++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int s = i; s >= 1; s--)
				System.out.print(" ");
			for (int j = i; j <= 4; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
