class Base1 {
	private int num;

	Base1(int num) {
		this.num = num;
	}
}

class Sub1 extends Base1 {
	private int num;

	Sub1() {
		super(0);
		System.out.println("in sub1 def");
	}

	Sub1(int num) {
		super(num);
		this.num=num;
		System.out.println("in sub1 1 param");
	}

	Sub1(int num1, int num2) {
		super(num1);
		num=num2;
		System.out.println("in sub1 2 param");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		Sub1 s2 = new Sub1(24);
		Sub1 s3 = new Sub1(24, 7);
	}
}
