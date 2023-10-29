public class MyApp implements Runnable {

	public void run() {
		disp();
	}
	
	synchronized void disp() {
		for (char c='A'; c<='J'; c++) {
			System.out.println(Thread.currentThread().getName()+"\t\t"+c);
		}
	}
	
}
