package clientpack;

import devpack.MyResource;
import devpack.ResourceNotAllocatedException;

public class Demo {

	public static void main(String[] args) {
		try {
			MyResource res = new MyResource(124);
			res.disp();
		} catch (ResourceNotAllocatedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nDone");
	}
}

