package com.concurrentDownload;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DownloadThreadPool /*extends ThreadPoolExecutor*/ extends ScheduledThreadPoolExecutor {
	
	private static int CORE_POOL_SIZE = 10;
	private static BlockingQueue blockingQueue;

	DownloadThreadPool(int CORE_POOL_SIZE){
		super(CORE_POOL_SIZE);
	//	super(CORE_POOL_SIZE,5,0,TimeUnit.SECONDS,blockingQueue);
	}

}
