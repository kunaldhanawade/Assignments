package clientpack;

import devpack.InvalidLengthException;

public class Demo {

	public static void main(String[] args) {
		try {
			Authenticator m = new Authenticator("kunal");
//			Authenticator m = new Authenticator("kd");
//			Authenticator m = new Authenticator("kunaldhanawade");
			m.done();
		} catch (InvalidLengthException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nDone");
	}

}

