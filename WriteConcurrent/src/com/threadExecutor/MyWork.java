package com.threadExecutor;

public class MyWork implements Runnable{

	private String name;
	
	
	public MyWork(String name) {
	this.name = name;
	}
	
	public void run(){
		
		System.out.println("Thread about to start executibg is............"+Thread.currentThread().getName());
		
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ex){
			
		}
		
		System.out.println(Thread.currentThread().getName()+"Finished execution............");
		
	}
	
	
	
}
