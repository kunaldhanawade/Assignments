class Top1 {
	void disp() {
		System.out.println("in class top1");
	}
}

class Bottom1 extends Top1 {
	void disp() {
		System.out.println("in bottom 1 def");
	}
}

class Bottom2 extends Top1 {
	void disp() {
		System.out.println("in bottom 2 def");
	}
}

class Bottom3 extends Top1 {
	void disp() {
		System.out.println("in bottom 3 def");
	}
}

public class Demo {
	public static void perform(Top1 ref) {
		ref.disp();
	}

	public static void main(String[] args) {
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());
	}
}
