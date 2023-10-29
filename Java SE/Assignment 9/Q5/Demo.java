package clientpack;

import devpack.Person;
import devpack.VotingNotAllowedException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Person p1 = new Person("roohi", 17);
			System.out.println(p1+" addded");
		} catch (VotingNotAllowedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			Person p2 = new Person("vinay", 24);
			System.out.println(p2+" addded");
		} catch (VotingNotAllowedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

