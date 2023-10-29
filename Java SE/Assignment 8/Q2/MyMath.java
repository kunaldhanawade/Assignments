package clientpack;

import devpack.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num) throws NumberNotDivisibleBySevenException {
		if(num%7!=0)
			throw new NumberNotDivisibleBySevenException();
		System.out.println("the entered no. is: "+num);
	}
}

