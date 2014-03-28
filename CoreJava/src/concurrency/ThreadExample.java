package concurrency;

public class ThreadExample implements Runnable{

	

	public static void main(String args[]) {
		
		Thread te = new Thread(new ThreadExample(),"first");
		
		ThreadGroup tg = new ThreadGroup("FirstGroup");

		te.start();
		
		
		
	}
	
	
	public void run() {
		System.out.println("--------- > "+ te.);
	}
	
}

















