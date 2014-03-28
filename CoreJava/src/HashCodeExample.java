import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashCodeExample {
	
	

	public static void main(String args[]) {
	
		Map<User,Integer> hm = new HashMap<User,Integer>();
		
		hm.put(new User("akkhil",1), 1);
		
		//hm.put(new User("gupta",2), 2);
		
	//	hm.put(new User("solan",3), 3);
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry) it.next();
		//System.out.println("values for ID s is... "+ entry.getValue());
		
		System.out.println("------------"+hm.get(new User("akkhil",1)));
		
		
		
	}
	
	
}
}


class User{
	private String name;
	private int score;
	
	User(String name,int score){
		this.name = name;
		this.score = score;
		
	}
	
	public boolean equals(Object obj){
		
		User user = (User) obj;
		
		return this.name.equals(user.name) && this.name == user.name && this.getClass().equals(user.getClass());
		
	}
	
	
//	public int hashCode(){
//		return score/3;
//	}
}

