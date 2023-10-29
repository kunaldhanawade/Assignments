interface A {
	void disp1();
}

interface B extends A {
	void disp2();
}

class C implements B {
	public void disp1() {
		System.out.println("in disp 1");
	}
	
	public void disp2() {
		System.out.println("in disp 2");
	}
	
	public void disp3() {
		System.out.println("in disp 3");
	}
}

public class Demo {
	
	public static void main(String[] args) {
		C at = new C();
		at.disp1();
		at.disp2();
		at.disp3();
	}
}
