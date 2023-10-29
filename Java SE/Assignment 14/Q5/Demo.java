interface First {
	static void disp1() {
		System.out.println("in disp1 of First");
	}
}

class Base {
	static void disp2() {
		System.out.println("in disp2 of Base");
	}
}

class Sub extends Base implements First {}

public class Demo {
	public static void main(String[] args) {
		First.disp1();
		Sub s = new Sub();
		s.disp2();
		Base b = new Base();
		b.disp2();
	}
}

