interface Fourth {
	default void disp3() {
		System.out.println("in default disp3 of Fourth");
	}
}

class Base1 {
	public void disp3() {
		System.out.println("in disp3 of Base1");
	}
}

class Sub1 extends Base1 implements Fourth {
	public void myfun() {
		System.out.println("in myfun of Sub1");
		Fourth.super.disp3();
	}
}

public class Demo {
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		s1.disp3();
		s1.myfun();
	}
}

