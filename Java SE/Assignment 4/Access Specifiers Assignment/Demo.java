import package1.Sub1;
import pakage2.*;

public class Demo {

	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		s1.disp1();
		
		Sub2 s2 = new Sub2();
		s2.disp2();
		
		OtherClass oc = new OtherClass();
		oc.disp3();
	}
}
