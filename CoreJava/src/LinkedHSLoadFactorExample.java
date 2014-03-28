import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class LinkedHSLoadFactorExample extends LinkedHashSet<String>{
	
	
	
	public LinkedHSLoadFactorExample(Collection<? extends String> c) { 
		super(Math.max(2*c.size(), 11), .75f); 
	}

	public static void main(String args[]) {
		Set c = new LinkedHashSet<String>();
		c.add("akkhil");
		c.add("kumar");
		c.add("gupta");
		c.add("aetretkkhil");
		c.add("kumaertertr");
		c.add("gupertwerta");
		c.add("akkhwerweril");
		c.add("kwewermar");
		c.add("guwerwpta");
		LinkedHSLoadFactorExample lhs = new LinkedHSLoadFactorExample(c);
		lhs.addAll(c);
		
		int result = Math.max(2*c.size(), 11);
		
		System.out.println("---"+ result);
		System.out.println("Size is "+c.size());
		 
		} 
	
	}

