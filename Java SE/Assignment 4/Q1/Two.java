import package1.*;

public class Two {
	public static void main(String[] args) {
		First f1 = new First(24);
		System.out.println(f1.getNum());
		
		Second s1 = new Second(7);
		System.out.println(s1.getNum());
		s1 = new Second();
		System.out.println(s1.getNum());
	}
}
