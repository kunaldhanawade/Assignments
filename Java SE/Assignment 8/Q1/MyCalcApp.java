import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a no. :");
		int num = sc.nextInt();
		
		Calculator c = new Calculator();
		try {
			int res = c.caldouble(num);
			System.out.println(res);
		} catch (MyArithException e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}

}

