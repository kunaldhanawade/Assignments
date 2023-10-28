public class Sample {
	public static String name;

	public static void main(String[] args) {
		Demo d = new Demo(24);
		System.out.println(d.getNum());
		d.setNum(7);
		System.out.println(d.getNum());
		
		System.out.println(Demo.getName());
	}
}
