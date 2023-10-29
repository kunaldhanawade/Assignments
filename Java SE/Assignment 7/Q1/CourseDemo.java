public class CourseDemo {

	public static void perform(Course c) {
		c.start();
		System.out.println("Rs. "+c.getFee());
		c.evaluate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new DACDBDACourse());
		System.out.println();
		perform(new MSCitCourse());
	}

}

