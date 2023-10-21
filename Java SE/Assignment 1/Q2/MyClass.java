import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0;
		
		System.out.println("Enter an Operator: ");
		int o = sc.next().charAt(0);
		
		switch(o) {
		case '+' : System.out.println(a+b); break;
		case '-' : System.out.println(a-b); break;
		case '*' : System.out.println(a*b); break;
		case '/' : System.out.println(a/b); break;
		case '%' : System.out.println(a%b); break;
		default : System.out.println("invalid choice");
		}
		
		sc.close();
	}
}
