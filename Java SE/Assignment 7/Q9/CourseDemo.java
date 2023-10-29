public class CourseDemo {
	
	static void show(Course ref) {
		System.out.println(ref.getClass().getName());
		System.out.print("\t");
		ref.start();
		System.out.print("\t");
		
		if(ref instanceof DACDBDACourse) {
			DACDBDACourse d = (DACDBDACourse) ref;
			d.orientation();
		}
		System.out.print("\t");
		ref.stop();
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new DACDBDACourse());
		show(new MSCit());
		show(new Basic());
	}
}

