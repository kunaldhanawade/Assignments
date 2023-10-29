interface First{
	default void fun() {
		System.out.println("in fun of First");
	}
}

interface Second{
	default void fun() {
		System.out.println("in fun of Second");
	}
}

class Child implements First, Second{

	@Override
	public void fun() {
		System.out.println("in fun of Child");
	}
	
}

public class Demo{
	public static void main(String[] args) {
		Child c = new Child();
		c.fun();
	}
}

