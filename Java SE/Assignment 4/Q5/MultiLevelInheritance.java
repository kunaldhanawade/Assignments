class Base {
	Base(int num){
		System.out.println("in base param");
	}
}

class Sub1 extends Base {
	Sub1(){
		super(24);
		System.out.println("in sub1 def");
	}
}

class Sub2 extends Sub1 {
	Sub2(int k){
		super();
		System.out.println("in sub2 param");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Sub2 s2 = new Sub2(24);
	}
}
