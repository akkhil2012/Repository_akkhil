
 abstract class AbsExample {
	
	protected int score = 10;

	AbsExample(int score){
		this.score = score;
	}
	
	AbsExample(){
		
	}

}



class SubClass extends AbsExample{
	

	SubClass(int score) {
		super(score);
		// TODO Auto-generated constructor stub
	}
	
	public SubClass() {
		super();
	}

	public static void main(String args[]) {
		
		System.out.println("---------"+new SubClass().score);
		
	}
	
	
	
	
	
}