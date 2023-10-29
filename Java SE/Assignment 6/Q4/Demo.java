package clientpack;

import devpack.*;

public class Demo {
	
	public static void perform(Vehicle v, int gear, int speed, int brake) {
		v.changeGear(gear--);
		v.speedUp(speed=speed-30);
		v.applyBrakes(brake);
	}

	public static void main(String[] args) {
		Vehicle v[] = new Vehicle[2];

		v[0] = new FourWheeler();
		v[1] = new TwoWheeler();
		
		for(int i=0; i<v.length; i++) {
			perform(v[i], 3, 80, 0);
			System.out.println();
		}
	}
}
