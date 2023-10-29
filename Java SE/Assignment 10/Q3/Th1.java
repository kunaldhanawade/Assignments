public class Th1 implements Runnable{
	
	synchronized public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=5; i++) {
			System.out.println(Thread.currentThread()+"\tExec. "+i);
		}
	}
}
