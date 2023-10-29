public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.start();
		t2.start();
	}
}
