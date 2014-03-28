package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	User user;
	
	public static void main(String args[]) {
		
		
		
		Set<User> hs = new TreeSet<User>();
		
		hs.add(new User(33));
		hs.add(new User(22));
		hs.add(new User(3));
		hs.add(new User(67));
		
		
	//	hs.add(1);
		//hs.add(2);
		//hs.add(1);
		//hs.add("null");
		//hs.add("null");
		//hs.add(null);
	//	hs.add(null);
		Iterator<User> it = hs.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			System.out.println("ids are....."+user.getId());
		}
		
	}
	
	
}


class User implements Comparator{

	private int id;
	

	User(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	/*public int compareTo(Object o){
		
		User us = (User)o;
		
		if(this.id > us.id){
			return -1;
		}else if(this.id < us.id)
		{
		 return 1;
		}
		return 0;
	}
*/
	
	public int compare(Object o1,Object o2) {
		
		User us1 = (User)o1;
		User us2 = (User)o2;
		
		if(us1.getId()>us2.getId()){
			return 1;
		}else if(us1.getId()<us2.getId()){
			return -1;
		}else{
			return 0;
		}
		
		
	}


	
	
	
	
}












