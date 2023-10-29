class Demo implements Runnable{
	
	static Class c;

	static void perform() {
		
		synchronized (c) {
			for (int i=1; i<=10; i++)
				System.out.println(Thread.currentThread()+"\t"+i);
		}
	}
	
	public void run() {
		perform();
	}

	public static void main(String[] args) throws Exception {
		c = Class.forName("Demo");

		Demo th1 = new Demo();
		Demo th2 = new Demo();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
	}
}
