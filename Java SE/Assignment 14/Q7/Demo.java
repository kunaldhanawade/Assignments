@FunctionalInterface
interface Second {
	void disp4();
}

public class Demo {
	public static void main(String[] args) {
		Second s1 = () -> {System.out.println("in disp4 of Second");};
		s1.disp4();
		System.out.println(s1.getClass().getName());
		
		Second s2 = () -> {System.out.println("also in disp4 of Second");};
		s2.disp4();
		System.out.println(s2.getClass().getName());
	}
}

