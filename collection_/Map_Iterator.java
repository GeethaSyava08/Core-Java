package collection_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Iterator {

	public static void main(String[] args) {
		
          Map<String, Integer> m=new HashMap<String, Integer>();
		
		m.put("marks",20);
		m.put("salary",20000);
		m.put("rupee",1);
		m.put("fee",1000);
		
		//System.out.println(m);
		Iterator<Map.Entry<String, Integer>> itr=m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			 Map.Entry<String, Integer> entry = itr.next();
			 System.out.println(entry);
		}
	}

}
