public class MyClass1 {

	public static void main(String[] args) {		
		for (int i=1; i<=5; i++) {
			for (int s=i; s>1; s--)
				System.out.print(" ");
			for (int j=i; j<=5; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
