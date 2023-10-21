public class MyClass {
	private int num1, num2;
	
	MyClass() {
		System.out.println("in def constr");
	}
	
	MyClass(int num1){
		this.num1 = num1;
		System.out.println("in 1 param constr");
	}
	
	MyClass(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("in 2 param constr");
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		System.out.println("num1: "+m1.getNum1()+"\tnum2: "+m1.getNum2());
		MyClass m2 = new MyClass(24);
		System.out.println("num1: "+m2.getNum1()+"\tnum2: "+m2.getNum2());
		MyClass m3 = new MyClass(24, 7);
		System.out.println("num1: "+m3.getNum1()+"\tnum2: "+m3.getNum2());
	}
}
