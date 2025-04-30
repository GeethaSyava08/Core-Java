package collection_;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> s= new HashSet<Integer>();
		s.add(91);
		s.add(81);
		s.add(31);
		
		System.out.println(s);
		boolean b=s.contains(91);
		System.out.println(b);
		
		s.remove(31);
		System.out.println(s);
		
		boolean b2=s.isEmpty();
		System.out.println(b2);
		
		int i= s.size();
		System.out.println("size is :" +i);
		
		s.removeAll(s);
		System.out.println(s);
	}

}
