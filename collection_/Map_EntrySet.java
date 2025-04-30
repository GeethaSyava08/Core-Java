package collection_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_EntrySet {

	public static void main(String[] args) {
		

		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(4,"plants");
		m.put(2,"poinsetta");
		m.put(1, "snowwhhite");
		m.put(3, "bamboo");
		System.out.println(m);
		
		for(Map.Entry<Integer, String> var:m.entrySet())
		{
			System.out.println(var.getValue() +": "+ var.getKey());
		}
		
		
	}

}
