class Base {	
	Base(){
		System.out.println("in base def");
	}
	
	Base(int num){
		System.out.println("in base param");
	}
}

class Sub1 extends Base {
	Sub1(){
		super();
		System.out.println("in sub1 def");
	}
}

class Sub2 extends Base {
	Sub2(int k){
		super(7);
		System.out.println("in sub2 param");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2(24);
	}
}
