class Parent {
	Parent(int x) {
		System.out.println("in parent param");
	}
}

class Child1 extends Parent {
	Child1 () {
		super(24);
		System.out.println("in child1 def");
	}

	Child1 (int x) {
		super(7);
		System.out.println("in child1 param");
	}
}

class Child2 extends Parent {
	Child2(int x) {
		super(1999);
		System.out.println("in child2 param");
	}
}


public class Demo {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		System.out.println();
		Child2 c2 = new Child2(404);

	}
}
