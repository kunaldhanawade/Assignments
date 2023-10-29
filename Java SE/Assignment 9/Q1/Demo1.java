public class Demo1 {

	public static void main(String[] args) {
		
		Everything e = new Everything();
		e.displ(1);
		e.displ(1,0.3);
		e.displ(1,0.3,true);
		e.displ(1,0.3,true, "kunal");
		e.displ(1,0.3,true, "kunal", new MyClass("Kunal"));
	}
}

