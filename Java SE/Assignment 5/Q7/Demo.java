class Parent1 {
	private int num;
	
	public void getNum() {
		System.out.println(num);
	}

	Parent1() {
		num = 24;
	}
}

interface Parent2 {
	void hello();
}

class Child extends Parent1 implements Parent2 {
	public void where() {
		System.out.println("in child");
	}
	
	public void hello() {
		System.out.println("hello");
	}
}

public class Demo {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.where();
		c.hello();
		c.getNum();
	}
}
