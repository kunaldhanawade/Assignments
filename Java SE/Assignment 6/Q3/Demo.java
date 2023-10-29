package clientpack;

import devpack.*;

public class Demo {

	public static void main(String[] args) {
		PersistenceMechanism ps[] = new PersistenceMechanism[3];

		ps[0] = new BigdataSystem ();
		ps[1] = new DatabaseSystem ();
		ps[2] = new FileSystem ();
		
		for(int i=0; i<ps.length; i++) {
			if(ps[i] instanceof BigdataSystem) {
				ps[i].writeData("big data system");
				System.out.println(ps[i].readData());
			}
		}
	}
}
