public class Everything {
	public void displ(int ...n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]);
			if (i!=n.length-1)
				System.out.print(", ");
		}
		System.out.println();
	}
}

