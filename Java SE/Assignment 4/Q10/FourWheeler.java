public class FourWheeler implements Vehicle {
	public void start() {
		System.out.println("in FourWheeler start");
	}
}

public class VDemo {
	public static void perform(Vehicle ref) {
		ref.start();
	}
	
	public static void main(String[] args) {
		System.out.println("using perform function");
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler());
		
		System.out.println("----------------------------");
		
		System.out.println("using array of instances");
		Vehicle v[] = new Vehicle[3];
		v[0] = new TwoWheeler();
		v[1] = new ThreeWheeler();
		v[2] = new FourWheeler();
		
		for (int i=0; i<v.length; i++) {
			v[i].start();
		}
	}
}
