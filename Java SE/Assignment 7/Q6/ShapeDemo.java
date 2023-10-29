package clientpack;

import devpack.*;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s[] = new Shape[3];

		s[0] = new Triangle();
		s[1] = new Rectangle();
		s[2] = new Circle();
		
		for(int i=0; i<s.length; i++) {
			s[i].draw();
		}
	}
}
