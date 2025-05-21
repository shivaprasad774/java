package demo0;

import java.util.Enumeration;
import java.util.Vector;

public class demo9 {
	public static void main(String[] args) {
		Vector<Integer>l1=new Vector<Integer>();
		l1.add(35);
		l1.add(80);
		l1.add(78);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		
	}

}
