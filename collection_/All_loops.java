package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class All_loops {

	public static void main(String[] args) {
		

		        ArrayList<Integer> list = new ArrayList<>();
		        list.add(10);
		        list.add(20);
		        list.add(30);
		        list.add(40);

		        System.out.println("---- 1. For Loop ----");
		        for (int i = 0; i < list.size(); i++) {
		            System.out.println("index " + i + ": " + list.get(i));
		        }

		        System.out.println("\n---- 2. While Loop ----");
		        int i = 0;
		        while (i < list.size()) {
		            System.out.println("index " + i + ": " + list.get(i));
		            i++;
		        }

		        System.out.println("\n---- 3. Iterator ----");
		        Iterator<Integer> iterator = list.iterator();
		        int index = 0;
		        while (iterator.hasNext()) {
		            System.out.println("index " + index + ": " + iterator.next());
		            index++;
		        }

		        System.out.println("\n---- 4. ListIterator (Forward) ----");
		        ListIterator<Integer> listIterator = list.listIterator();
		        while (listIterator.hasNext()) {
		            int idx = listIterator.nextIndex();
		            System.out.println("index " + idx + ": " + listIterator.next());
		        }

		        System.out.println("\n---- 5. ListIterator (Backward) ----");
		        while (listIterator.hasPrevious()) {
		            int idx = listIterator.previousIndex();
		            System.out.println("index " + idx + ": " + listIterator.previous());
		        }
		    }
		
	}


