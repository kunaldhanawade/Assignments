class Display {
	synchronized void disp() {
		for (int i=1; i<=10; i++)
			System.out.println(i+"\t"+Thread.currentThread().getName());
	}
}
public class Demo {
	public static void main(String[] args) {
		Display d = new Display();
		
		Runnable ref = () -> d.disp();
		
		Thread t1 = new Thread(ref, "First");
		Thread t2 = new Thread(ref, "Second");
		
		t1.start();
		t2.start();
	}
}

