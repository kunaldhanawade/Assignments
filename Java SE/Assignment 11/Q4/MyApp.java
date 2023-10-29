public class MyApp implements Runnable {
	
	ReentrantLock mylock=new ReentrantLock();
	Condition value=mylock.newCondition();
	
	public void run() {
		disp();
	}
	
	void disp() {
		mylock.lock();
		try {
			for (int i=1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName()+"\t\t"+i);
				if (i==5) {
					value.signal();
					value.await();
				}
				if (i==10) {
					value.signal();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			mylock.unlock();
		}
	}
}
