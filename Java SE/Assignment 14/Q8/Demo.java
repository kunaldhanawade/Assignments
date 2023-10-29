@FunctionalInterface
interface MyInterface {
	void fun();
}

public class Demo {
	public static void perform(MyInterface mi) {
		mi.fun();
	}
	
	public static void main(String[] args) {
		perform(() -> {System.out.println("having fun");});
	}
}

