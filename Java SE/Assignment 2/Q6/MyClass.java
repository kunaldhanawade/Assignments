public class MyClass {
	
	public static void main(String[] args) {
		System.out.println("ch of class A: "+A.getCh());
		A a = new A();
		a.setNum(24);
		System.out.println("num of class A: "+a.getNum());
		System.out.println();
		
		System.out.println("ch of class B: "+B.getCh());
		B b = new B();
		b.setNum(24);
		System.out.println("num of class B: "+b.getNum());
		System.out.println();
		
		System.out.println("ch of class C: "+C.getCh());
		C c = new C();
		c.setNum(24);
		System.out.println("num of class C: "+c.getNum());
	}
}
