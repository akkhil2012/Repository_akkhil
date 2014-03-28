package ThreadPoolExeutorExample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThPoolExcutorExample extends ThreadPoolExecutor {
	
	private static int CORE_POOL_SIZE=5;
	
	private static int MAX_POOL_SIZE=20;
	private static long KEEP_ALIVE_TIME=5000;
	private static TimeUnit UNIT;
    private static BlockingQueue<Runnable> WORK_QUEUE;
    
    
    private int core_pool_size;
    private int max_pool_size;
    private long keepAliveTime;
    private  TimeUnit unit;
    private static BlockingQueue<Runnable> workQueue;
    
    public ThPoolExcutorExample(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    //	super(corePoolSize);
    	super(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME,UNIT,WORK_QUEUE);
    	this.core_pool_size = CORE_POOL_SIZE;
    	this.max_pool_size = maximumPoolSize;
    	this.keepAliveTime = keepAliveTime;    
    	this.unit=unit;    	
    	this.workQueue = workQueue;
}
    
    
//    ThPoolExcutorExample(int core_pool_size){
//    	super(CORE_POOL_SIZE);
//    	this.core_pool_size = CORE_POOL_SIZE;
//    }
    
    
    
	public static void main(String args[]) {
		
		ThPoolExcutorExample thPoolExcutorExample = new ThPoolExcutorExample(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME,UNIT,WORK_QUEUE);
		if(null==thPoolExcutorExample){
			System.out.println("Object is nulll");
		}
	//	ThPoolExcutorExample thPoolExcutorExample = new ThPoolExcutorExample(CORE_POOL_SIZE);
	//	for(int i=0;i<15;i++){
		Future future = thPoolExcutorExample.submit(new RunnableTask());
	//	}
		//System.out.println("----------->>>>>"+thPoolExcutorExample.getPoolSize());

	}
	
}