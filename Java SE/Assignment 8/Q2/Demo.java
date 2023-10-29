package clientpack;

import devpack.NumberNotDivisibleBySevenException;

public class Demo {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		
		try {
			m.disp(7);
		} catch (NumberNotDivisibleBySevenException e) {
			System.out.println(e);
		}
		System.out.println();
		try {
			m.disp(24);
		} catch (NumberNotDivisibleBySevenException e) {
			System.out.println(e);
		}
		System.out.println("\nDone");
	}

}

