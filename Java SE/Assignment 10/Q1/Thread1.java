public class Thread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char c='A'; c<='J'; c++) {
			System.out.println(Thread.currentThread()+"\t"+c);
		}
	}
}
