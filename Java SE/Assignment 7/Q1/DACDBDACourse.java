public class DACDBDACourse extends Course {
	private double fee;
	
	DACDBDACourse() {
		fee=1000000;
	}

	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}

	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println("evaluating DAC/DBDA Course");
	}	
}
