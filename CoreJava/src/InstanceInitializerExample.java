import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class InstanceInitializerExample {

	public static void main(String args[]) {
		
		final Map<String, String> codes = 
			    Collections.synchronizedMap(new HashMap<String, String>() {
			    {
			        put("A", "Alpha");
			        put("B", "Bravo");
			    }
			});
		
		System.out.println("--------- Values are----------------" + codes.get("A") );
		
	}
	
	
}
