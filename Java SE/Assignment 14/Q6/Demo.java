@FunctionalInterface
interface First {
	void disp1();
	default void disp2(){
		System.out.println("in disp2 of First");
	}
	static void disp3(){
		System.out.println("in disp3 of First");
	}
}

public class Demo {
	public static void main(String[] args) {
		First f1 = () -> {System.out.println("in disp1 of First");};
		f1.disp1();
		f1.disp2();
		First.disp3();
		
		System.out.println(f1.getClass().getName());
	}
}

