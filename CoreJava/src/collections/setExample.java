package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.ElementIterator;



public class setExample {

		
		public static void main(String args[]) {
			
		TreeSet hs = new TreeSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(2);
		
		Iterator it = hs.iterator();
			while(it.hasNext()){
				System.out.println("value after iteration is........."+it.next());
			}
		}

	}


