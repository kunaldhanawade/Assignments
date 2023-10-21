public class MyClass {
	
	public static void main(String[] args) {
		DemoOb d1 = new DemoOb(100);
		// here we create an object d1 of class DemoOb
		
		DemoOb ref1 = d1;
		/* 
		here we assign the reference of object d1 to ref1
		so the address of object on heap which is in d1 gets stored in ref1
		so ref1 and d1 point to the same object 
		*/
		
		ref1 = new DemoOb(200);
		/*
		here we create a new object and use ref1 to point to that new object
		so now both ref1 and d1 point to two different objects
		*/
	}
}
