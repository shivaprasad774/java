package demo8demo0;
import java.util.*;

public class demo12 {
	public static void  main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(78);
		System.out.println(l1);
		Iterator il = l1.iterator();
		while(il.hasNext()) {
			System.out.println(il.next());
			
		}

}
}
