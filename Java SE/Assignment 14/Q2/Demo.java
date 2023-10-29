interface Third {
	default void disp1() {
		System.out.println("in default disp1 of Third");
	}
	
	static void disp2() {
		System.out.println("in static disp2 of Third");
	}
}

class Sub implements Third {
}

public class Demo {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.disp1();
		Third.disp2();
	}
}

