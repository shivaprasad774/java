package demo0;
import java.util.*;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(13);
		l1.add(45);
		l1.add(69);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(35);
		l2.add(68);
		l2.add(79);
		l2.addAll(l1);
		l2.add(null);
		System.out.println(l2);

	}

}

