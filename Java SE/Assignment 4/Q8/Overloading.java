class Parent {
	void disp() {
		System.out.println("in parent disp");
	}
}

class Child extends Parent {
	void disp(String name) {
		System.out.println("in child disp "+name);
	}
}

public class Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
		c.disp("kunal");
	}
}
