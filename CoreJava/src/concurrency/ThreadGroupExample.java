package concurrency;


	class ThreadGroupExample extends Thread{
		
		 ThreadGroup tg;
		 String name;
		
		ThreadGroupExample(ThreadGroup tg, String name){
			super(tg,name);
			this.tg = tg;
			this.name = name;
		}
		
		
		
		public static void main(String args[]) {
		
		ThreadGroup tg = new ThreadGroup("FirstGroup");
			
		ThreadGroupExample t1 = new ThreadGroupExample(tg, "first_thread");
		ThreadGroupExample t2 = new ThreadGroupExample(tg, "sec_thread");
		ThreadGroupExample t3 = new ThreadGroupExample(tg, "third_thread");
		ThreadGroupExample t4 = new ThreadGroupExample(tg, "fourth_thread");
		
		
		tg.list();
		
		System.out.println("------------->>>>"+tg.getName());
		
	//	tg.getName();
		}
	 
		
		
		
	}

