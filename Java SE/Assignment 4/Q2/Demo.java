class Demo {
	private static String name;
	int num;
	
	Demo(int num) {
		this.name = "Kunal";
		this.num = num;
	}
	
	public static String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

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
