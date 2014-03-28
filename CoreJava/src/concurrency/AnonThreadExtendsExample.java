package concurrency;

public class AnonThreadExtendsExample extends Thread{

	
	public static void main(String args[]){
	
	Thread th = new Thread(){
    
    public void run(){
  
    	System.out.println("--------------"+Thread.currentThread().getName());
    }
		
	
};	

th.start();
System.out.println("------>>>>>--------"+th.getName());
	
	}
}
