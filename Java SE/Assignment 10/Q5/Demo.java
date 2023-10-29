class Demo implements Runnable {
	
	void ascending() {
		for(int i=1; i<=50; i++) {
			System.out.println(Thread.currentThread()+"\t"+i);
		}
	}
	
	void descending() {
		for(int i=50; i>0; i--) {
			System.out.println(Thread.currentThread()+"\t"+i);
		}
	}
	
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("ascending"))
			ascending();
		else
			descending();
	}

	public static void main(String[] args) throws Exception {
		
		Demo th1 = new Demo();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);
		
		t1.setName("ascending");		
		t2.setName("descending");
		
		t1.start();
		t2.start();
	}
}
