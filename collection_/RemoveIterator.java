package collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveIterator {

	public static void main(String[] args) {
		
			
		        ArrayList<Integer> list = new ArrayList<>();
		        list.add(10);
		        list.add(20);
		        list.add(30);

		        Iterator<Integer> it = list.iterator();
		        while (it.hasNext()) 
		        {
		            int val = it.next();
		          //  int val2=it.hashCode();
		         //   System.out.println("list" +val);
		           // System.out.println(val2);
		            
		            if (val == 10) 
		            {
		                it.remove(); 
		        }

		        System.out.println(list); 
		    }
		}
	}

