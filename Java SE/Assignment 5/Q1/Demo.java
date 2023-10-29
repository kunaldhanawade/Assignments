class GrandParent {
	GrandParent(int x) {
		System.out.println("in grandparent param");
	}
}

class Parent extends GrandParent {
	Parent () {
		super(24);
		System.out.println("in parent def");
	}

	Parent (int x) {
		super(7);
		System.out.println("in parent param");
	}
}

class Child extends Parent {
	Child() {
		super(30);
		System.out.println("in child def");
	}
	
	Child(int x) {
		System.out.println("in child param");
	}
}

public class Demo {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println();
		c = new Child(404);
	}
}
