package pakage2;

import package1.Base;

public class OtherClass {
	public void disp3()
	{
		// fun1(); // no
		// fun2(); // no
		// fun3(); // no
		
		Base b=new Base();
		b.fun4();
		System.out.println("in OtherClass public disp3");
	}
}
