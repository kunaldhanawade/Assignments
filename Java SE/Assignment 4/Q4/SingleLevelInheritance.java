class Base {	
	Base(int num){
		System.out.println("in base param");
	}
}

class Sub extends Base {
	Sub(){
		super(2);
		System.out.println("in sub def");
	}
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		Sub s = new Sub();
	}
}
