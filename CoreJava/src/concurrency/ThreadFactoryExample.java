package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample implements Runnable{
	
	private String name;
	private volatile boolean flag;
	private Counter counter;
	
	
	ThreadFactoryExample(String name,Counter counter){
		this.name = name;
		this.counter = counter;
	}

	public static void main(String args[]) {
		
		Counter counter = new Counter();
		
//		ThreadFactory tf = Executors.defaultThreadFactory();
//		
//		tf.newThread(new ThreadFactoryExample("first")).start();
//		tf.newThread(new ThreadFactoryExample("Sec")).start();
//		tf.newThread(new ThreadFactoryExample("third")).start();
		
		 new Thread(new ThreadFactoryExample("first",counter)).start();
		 new Thread(new ThreadFactoryExample("sec",counter)).start();
		 new Thread(new ThreadFactoryExample("third",counter)).start();
		 new Thread(new ThreadFactoryExample("fourth",counter)).start();
		 new Thread(new ThreadFactoryExample("5",counter)).start();
		 new Thread(new ThreadFactoryExample("6",counter)).start();
		 new Thread(new ThreadFactoryExample("7",counter)).start();
		 new Thread(new ThreadFactoryExample("8",counter)).start();
		 new Thread(new ThreadFactoryExample("9",counter)).start();
		 new Thread(new ThreadFactoryExample("99",counter)).start();
		 new Thread(new ThreadFactoryExample("88",counter)).start();
		 new Thread(new ThreadFactoryExample("77",counter)).start();
		
	}
	
	
	public void run(){
		flag = true;
	//	if(flag == true){
		long result = counter.add(12);
		
		System.out.println("Thread accessing the with value"+result+ Thread.currentThread().getName());
//		}else{
//			System.out.println("Thread accessing the with value"+ counter.count+ "  is......... "+ Thread.currentThread().getName());	
//		}
		flag = false;
				
	}
	
	
}



class Counter {

    protected long count = 0;

    public long add(long value){
        this.count = this.count + value;   
        return this.count;
    }
 }

