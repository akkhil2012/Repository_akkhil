package concurrency;

public class WaitNotifyAllExample {
	
	public static void main(String args[]) {
		Resource res = new Resource();
		
		Thread1 t1 = new Thread1(res);
		t1.setName("first");
		
		t1.start();
		t1.run();
		
		Thread1 t2 = new Thread1(res);
		t2.setName("sec");
		t2.start();
		t2.run();
		
	}

}



class Thread1 extends Thread{
	
	Resource res;
	
	public Thread1(Resource res) {
		this.res = res;
	}
	
	
	public void run(){
		synchronized (res) {
			System.out.println("Thread Accessing wait method............."+Thread.currentThread().getName());
			try {
				res.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class Thread2 extends Thread{
	Resource res;
	
	public Thread2(Resource res) {
		this.res = res;
	}
	
	public void run(){
		synchronized (res) {
			System.out.println("Thread Accessing notify method............."+Thread.currentThread().getName());
			res.notifyAll();
		}
	}
}



class Resource{
	
	public void getInfo(){
		System.out.println("GetInfo method accessed by........"+Thread.currentThread().getName());
	}
	
}
