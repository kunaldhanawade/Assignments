public class ShapeDemo {
	public static void perform(Shape ref) {
		ref.draw();
	}
	
	public static void main(String[] args) {
		System.out.println("using perform function");
		perform(new Circle());
		perform(new Polygon());
		perform(new Rectangle());
		
		System.out.println("----------------------------");
		
		System.out.println("using array of instances");
		Shape s[] = new Shape[3];
		s[0] = new Circle();
		s[1] = new Polygon();
		s[2] = new Rectangle();
		
		for (int i=0; i<s.length; i++) {
			s[i].draw();
		}
	}
}
