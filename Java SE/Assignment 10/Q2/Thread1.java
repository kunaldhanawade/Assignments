public class Thread1 implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		for (char c='A'; c<='J'; c++) {
			System.out.println(Thread.currentThread()+"\t"+c);
		}
	}
}
