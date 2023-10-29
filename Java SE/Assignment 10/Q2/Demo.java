public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th = new Thread1();
		
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.start();
		t2.start();
	}

}
