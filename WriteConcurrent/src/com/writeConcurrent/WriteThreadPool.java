package com.writeConcurrent;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WriteThreadPool /*extends Executors*/{
	
	
	WriteRunnable taskFirst = new WriteRunnable();
	WriteRunnable taskSec = new WriteRunnable("Sec_Thread",1);
	WriteRunnable taskThird = new WriteRunnable(1,"Third_Thread");
	Future future1,future2,future3;
		
    WriteThreadPool() throws InterruptedException, ExecutionException{
   // 	super();
    	
    System.out.println("Inside Pool Constructor.....");	
		
	ExecutorService executors = Executors.newScheduledThreadPool(3);
	
	
	//for(int i=0;i<3;i++){
	 future1 = executors.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task for thread first " + Thread.currentThread().getName());
		        
		        ObjectOutputStream oos;
				try {
					oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/home/akhilg/PropertiesNew.ser")));
					oos.writeObject(new WriteProperties("DatabaseProiperties",1));
					oos.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		    }
		});
	 
	 future1.get();
	 
	 future2 = executors.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task for thread sec " + Thread.currentThread().getName());
		        
		        ObjectInputStream ios;
		        
		        try {
					ios = new ObjectInputStream(new BufferedInputStream(new FileInputStream("/home/akhilg/PropertiesNew.ser")));
					WriteProperties userObject = (WriteProperties) ios.readObject();
					ios.close();
					System.out.println("Values for the Properties after deserialization...."+userObject.name + "id is " + userObject.id  );
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      
				
		    }
		});
	 
	 
	 future3 = executors.submit(new Runnable() {
		    public void run() {
		    	System.out.println("Asynchronous task for thread third " + Thread.currentThread().getName());
		    }
		});
	 
	 
	//}
//	if(future.isDone()){
//		System.out.println("ASYNC task done............");
//	}else{
//		
//		try {
//			future.get();
////		/	System.out.println("Thread retreving the Executors Computation result is..........."+future.);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("After compuing");
//	}
		
	}

}
