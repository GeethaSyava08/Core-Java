package collection_;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) {
    
		Map m=new HashMap();
		m.put(1,"map");
		m.put("class2", "hashmap");
		m.put("class3","LinkedHashmap");
		m.put("class4", "HashTable");
		m.put(0, "map");
		
		System.out.println(m);
		
		Map m2=new HashMap();
		m2.put("interface", "Navigable Map");
		m2.put("interface2", "SortedMap");
		System.out.println(m2);
		m.putAll(m2);
		
		System.out.println(m);
      //   m2.clear();
       //  System.out.println(m2);
        boolean a=m.equals(m2);
        System.out.println(a);
       System.out.println("get method : "  +m.get(0));
       System.out.println(m2.get("interface"));
     //Returns the value mapped with the specified key or null if the key is not mapped
       
      // m.remove(0);
     //  System.out.println(m);
       
       m.replace(0, "TreeMap");
       System.out.println(m);
       
       System.out.println(m.size());
       
          System.out.println( m.containsKey(0));
          System.out.println(m.containsValue("TreeMap"));
          System.out.println(m2.isEmpty());
          System.out.println(m2.hashCode());

        
	}

}
