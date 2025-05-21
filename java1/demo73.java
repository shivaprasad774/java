package demo0;
import java.util.*;

public class demo6 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(34);
		l1.add(67);
		l1.add(46);
		//System.out.println(l1);
		l1.addFirst(10);
		l1.add(3,50);
		l1.add(100);
		System.out.println(l1);
		l1.remove(1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(67);
		System.out.println(l1);
		
		
	}

}
