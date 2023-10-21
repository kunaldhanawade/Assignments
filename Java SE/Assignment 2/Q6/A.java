class A {
	private static char ch='A';
	private int num;
	
	static {
		System.out.println("in static block of class A");
	}
	
	public static char getCh() {
		return ch;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
