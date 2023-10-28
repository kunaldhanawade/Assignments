package pakage2;

import package1.Base;

public class Sub2 extends Base {
	public void disp2()
	{
		System.out.println("in sub2 public disp2");
		// fun1(); // no
		// fun2(); // no
		fun3(); // yes
		fun4(); // yes
	}
}
