class B {
	private static char ch='B';
	private int num;
	
	static {
		System.out.println("in static block of class B");
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
