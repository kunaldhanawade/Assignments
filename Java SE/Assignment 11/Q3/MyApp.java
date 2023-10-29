public class MyApp implements Runnable {
	
	ReentrantLock lock = new ReentrantLock();

	public void run() {
		disp();
	}
	
	void disp() {
		lock.lock();
		for (char c='A'; c<='J'; c++) {
			System.out.println(Thread.currentThread().getName()+"\t\t"+c);
		}
		lock.unlock();
	}
	
}
