class Parent {
	void disp() {
		System.out.println("in parent disp");
	}
}

class Child extends Parent {
	void disp() {
		System.out.println("in child disp");
		super.disp();
	}
}

public class Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
	}
}
