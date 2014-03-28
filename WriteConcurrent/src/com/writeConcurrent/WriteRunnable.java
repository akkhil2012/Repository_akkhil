package com.writeConcurrent;

public class WriteRunnable implements Runnable{
	
	private String name;
	private int id;
	
	
	Runnable r1 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread executing is....."+Thread.currentThread().getName());
			
		}
	};
	
	
	
	WriteRunnable(){
		
	}
	
	WriteRunnable(String name,int id){
		this.id = id;
		this.name = name;
	}
	
	WriteRunnable(int id,String name){
		this.id = id;
		this.name = name;
	}

	public void run() {
		
		System.out.println("Thread executing is....."+Thread.currentThread().getName());
	}

}
