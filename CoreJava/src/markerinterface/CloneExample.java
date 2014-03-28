package markerinterface;

public class CloneExample {

	public static void main(String args[]) {
   
    User userClone= null;
		
	User user = new User("akkhil", "gupta");
	try{
		userClone = user.clone();
	}catch(CloneNotSupportedException ce){
		
	}
	
	if((user!=userClone) && user.equals(userClone) && user.getClass() == userClone.getClass()){
		
		System.out.println("Objects are cloned.............");
		
	}else{
		System.out.println("Not cloned.................");
	}
	
	
	

	}
  
}

 






