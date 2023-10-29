package clientpack;

import devpack.InvalidLengthException;

public class Authenticator {

	public Authenticator(String pwd) throws InvalidLengthException {
		int len = pwd.length();
		if(len<5 || len>9)
			throw new InvalidLengthException();
	}
	
	public void done() {
		System.out.println("sucessful authentication");
	}
}

