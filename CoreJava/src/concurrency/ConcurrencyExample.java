package concurrency;

public class ConcurrencyExample implements Runnable{
  
	CounterClass counterClass;
	
	ConcurrencyExample(CounterClass counterClass){
		this.counterClass = counterClass;
	}
	
	public static void main(String args[]) {
		
		CounterClass cc = new CounterClass();
		
		ConcurrencyExample ce = new ConcurrencyExample(cc);// ONLY ONE SHARED INSTANCE
		
		Thread t1 = new Thread(ce,"first");
		Thread t2 = new Thread(ce,"sec");
		
		t1.start();
		t2.start();
	}
	
	
	
	public void run(){
		
		counterClass.getCount();
		
	}
	
}



class CounterClass{
	
	public void getCount(){
		for(int i=0;i<10;i++){
			System.out.println("Value is " + i +"-------- by thread-------" + Thread.currentThread().getName());
		}
	}
	
	
}
