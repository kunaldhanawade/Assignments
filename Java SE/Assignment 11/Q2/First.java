public class First
{
	public static void main(String args[]) {
		ExecutorService exse = Executors.newFixedThreadPool(2);
		
		MyApp myapp = new MyApp();
		
		exse.execute(myapp);
		exse.execute(myapp);
		
		exse.shutdown();
	}
}
