package com.threadExecutor;

public class MyRunnable implements Runnable{

	
	String name;
	
	
	
	MyRunnable(String name){
		this.name = name;
	}
	public void run() {
		System.out.println("Inside MyRunnable Factory............:)");
		
	}

}
