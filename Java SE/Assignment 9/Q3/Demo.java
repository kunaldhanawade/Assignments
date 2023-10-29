class A {
	public void Afun() {
		System.out.println("in Afun");
	}
}

class B {
	public void Bfun() {
		System.out.println("in Bfun");
	}
}

class C {
	public void Cfun() {
		System.out.println("in Cfun");
	}
}

class D {
	public void Dfun() {
		System.out.println("in Dfun");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Object ob[] = {
				new A(),
				new B(),
				new C(),
				new D()
		};
		
		for(Object ref: ob) {
			if(ref instanceof C) {
				C c = (C) ref;
				c.Cfun();
			}
		}
	}
}
