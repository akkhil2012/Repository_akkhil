package com.threadExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThExecutorExample {
	
	public static void main(String args[]) {
		BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(2);
		RejectedExecutionHandler executionHandler = new MyRejectedExecutionHandelerImpl();

		ThreadFactory threadFactoryTest = new ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
				Thread th = new Thread(new MyRunnable("333"));
				return th;
			}
		};
		
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(6,3, 
		10, TimeUnit.SECONDS, worksQueue,threadFactoryTest);
		
		executor.allowCoreThreadTimeOut(true);

		
		executor.execute(new MyRunnable("1"));
		executor.execute(new MyRunnable("2"));
		executor.execute(new MyRunnable("3"));
		executor.execute(new MyRunnable("4"));
		executor.execute(new MyRunnable("5"));
		
		
//		executor.execute(new MyWork("1"));
//		executor.execute(new MyWork("2"));
//		executor.execute(new MyWork("3"));
//		executor.execute(new MyWork("4"));
//		executor.execute(new MyWork("5"));
//		executor.execute(new MyWork("6"));
//		executor.execute(new MyWork("7"));
//		executor.execute(new MyWork("8"));
//		 
		
	}
	
	

}
