public class MSCitCourse extends Course {
	private double fee;
	
	MSCitCourse() {
		fee=50000;
	}

	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}

	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println("evaluating MSCIT Course");
	}
}
