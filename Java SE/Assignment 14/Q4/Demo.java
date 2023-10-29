interface Base1 {
	default void fun1() {
		System.out.println("in fun1 of Base1");
	}
}

interface Sub1 extends Base1 {
	default void fun2() {
		System.out.println("in fun2 of Sub1");
		Base1.super.fun1();
	}
}

class Sub2 implements Sub1 {
	public void fun3() {
		System.out.println("in fun3 of Sub2");
		Sub1.super.fun2();
	}
}

public class Demo {
	public static void main(String[] args) {
		Sub2 s2 = new Sub2();
		s2.fun3();
	}
}

