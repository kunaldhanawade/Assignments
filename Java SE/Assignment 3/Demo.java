package clientpack;

import devpack.First;
import devpack.Second;

public class Demo {

	public static void main(String[] args) {
		First f = new First(24);
		System.out.println(f.getNum());
		f.setNum(7);
		System.out.println(f.getNum());
		
		Second s = new Second();
		s.setName("kunal");
		System.out.println(s.getName());
	}
}
