class Vehicle {
	void start() {
		System.out.println("vehicle started...");
	}
}

class FourWheeler extends Vehicle {
	void start() {
		System.out.println("Four Wheeler started");
	}
}

public class Demo {

	public static void main(String[] args) {
		FourWheeler fw = new FourWheeler();
		fw.start();
	}
}
