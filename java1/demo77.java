package demo0;
import java.util.*;

public class demo10 {
	public static void main(String[] args) {
		Queue<Integer> l1 =new PriorityQueue<Integer>();
		l1.add(67);
		l1.add(58);
		l1.add(94);
		System.out.println(l1);
		l1.poll();
		System.out.println(l1);
		l1.remove();
		System.out.println(l1);
	
	}

}
