package ThreadPoolExeutorExample;

public class RunnableTask implements Runnable{

	
	private int i;
	private int count=0;
	private boolean status=false;
	
	
	public RunnableTask(){
		
	}
	
	
	public RunnableTask(int i) {
		this.i = i;
	}
	
	
	
	public void run() {
		while(true){
			for(;count<20;){
		System.out.println("Thread executing is................"+Thread.currentThread().getName()+"value for variable count is..."+count);
		this.status = true;
		count++;
			}
		}
	}
	
	
	
//	Runnable rn = new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	};

}
