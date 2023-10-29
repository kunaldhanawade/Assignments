public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 th = new Th1();

		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		Thread t3 = new Thread(th);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
