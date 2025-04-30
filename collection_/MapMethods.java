package collection_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

	public static void main(String[] args) {

		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		
		m.put("marks",20);
		m.put("salary",20000);
		m.put("rupee",1);
		m.put("fee",1000);
		
		System.out.println(m);
		
		Map m2=new TreeMap();
		m2.put(4,"plants");
		m2.put(2,"poinsetta");
		m2.put(1, "snowwhhite");
		m2.put(0, "bamboo");
		System.out.println(m2);
		
		m2.replace(0, "moneyplant");
		System.out.println(m2);
		
		m.replace("fee", 1000, 200);
		System.out.println(m);
		
		            System.out.println(m.values());//all values
		
	               	System.out.println(m2.keySet());//all keys
		
		m2.putIfAbsent(8, "butterfly");////If the specified key is not already associated with a value associates it with the given value
		System.out.println(m2);
		
		//Using EntrySet to fetch both key and value
		System.out.println(m.keySet());
	}

}
