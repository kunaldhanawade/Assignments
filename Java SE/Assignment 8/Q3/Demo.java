public class Demo {
	
	public static void show1() {
		try {
			show2();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public static void show2() throws MyException {
		show3(7);
		show3(24);
	}
	
	public static void show3(int num) throws MyException {
		if(num>10)
			throw new MyException("Number is greater than 10");
		System.out.println("the number is: "+num);
	}

	public static void main(String[] args) {
		show1();
		System.out.println("Done");
	}
}

