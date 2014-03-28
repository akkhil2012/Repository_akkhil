package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample implements Callable{
	
	private String name;
	
	ExecutorServiceExample(String name){
		this.name = name;
	}
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
	
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<35;i++){ // The upper Limit can extend the count defined for the numebr of threads as 
			// the Thread form pool will be used.... 
		Future ft = es.submit(new ExecutorServiceExample(""+i));
		//	es.execute(new ExecutorServiceExample(""+i));
		//System.out.println("---------->>>>"+ ft.toString());
		
		System.out.println("Result from asyncronous Future inerface....."+ft.get());
		
		}
	}

	
	public Object call() {
		int i=0;
		System.out.println("Method accesed by thread............"+Thread.currentThread().getName());
		for(;i<10;i++){
			
			System.out.println("accessed by thread.... "+ Thread.currentThread().getName() + i + "th time");
		}
		return i;
		
	}
}
