public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c[] = new Course[3];
		c[0] = new DACDBDACourse();
		c[1] = new MSCit();
		c[2] = new Basic();
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].getClass().getName());
			System.out.print("\t");
			c[i].start();
			System.out.print("\t");
			
			if(c[i] instanceof DACDBDACourse) {
				DACDBDACourse d = (DACDBDACourse) c[i];
				d.orientation();
			}
			System.out.print("\t");
			c[i].stop();
			
			System.out.println();
		}
	}

}

