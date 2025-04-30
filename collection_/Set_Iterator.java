package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iterator {

	public static void main(String[] args) {

		Set<String> s=new HashSet<String>();
		s.add("apple");
		s.add("banana");
		s.add("watermelon");
		//s.add("apple");
		System.out.println(s);
		
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			String s1=i.next();
			if(s1.equals("apple")) {
				i.remove();
			}
			
		}
		System.out.println(s);
	}

}
