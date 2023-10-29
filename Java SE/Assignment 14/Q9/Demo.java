@FunctionalInterface
interface Calculator {
	int multiply(int a, int b);
}

public class CalcDemo {
	public static void main(String[] args) {
		Calculator calc = (a, b)-> a*b;
		
		System.out.println("product="+calc.multiply(24, 7));
	}
}

