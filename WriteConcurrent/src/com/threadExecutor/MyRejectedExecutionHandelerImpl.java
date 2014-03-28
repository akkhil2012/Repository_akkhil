package com.threadExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejectedExecutionHandelerImpl implements RejectedExecutionHandler{

	
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		
		System.out.println("The Thread being rejected is---------->>>>>"+r.getClass().getName());
	}

	
	
}
