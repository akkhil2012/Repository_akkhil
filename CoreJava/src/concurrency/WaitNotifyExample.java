package concurrency;

public class WaitNotifyExample implements Runnable{
	ResourceNew res;
	
	WaitNotifyExample(ResourceNew res){
	  this.res = res;	
	}
	
	
	public static void main(String args[]) {
		final ResourceNew res = new ResourceNew();
		
		Runnable t1 = new Runnable() {
			
			public void run(){
				
				
				try {
					
					synchronized (res) {
						System.out.println("Before method wait......"+Thread.currentThread().getName());
					res.getInfo();
					res.wait();
				//	res.getInfo();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		};
		
		Runnable t2 = new Runnable() {
			
			
			public void run() {
				synchronized (res) {
					System.out.println(" before notify......"+Thread.currentThread().getName());
					res.getInfo();
					res.notify();
					
				}
				
			}
		};
		
		
		
		
		
		//Thread t1 = new Thread(new WaitNotifyExample(),"first");
		
		//t1.run();
	//	t1.run();
		
		
		//t2.run();
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
//	public void run(){
//		
//			
//			try {
//				
//				synchronized (res) {
//					System.out.println("Before method wait......"+Thread.currentThread().getName());
//				res.getInfo();
//				res.wait();
//			//	res.getInfo();
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	
//	}
	

}


class ResourceNew{

	public void getInfo(){
		//synchronized(this){
		System.out.println("Thread accessing the resouce is before notify......"+Thread.currentThread().getName());
	// }
	}
}








