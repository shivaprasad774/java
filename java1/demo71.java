package demo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hii");
		l1.add(46);
		System.out.println(l1);
		List<Object> extra=Arrays.asList("shiva","harsha","sai");
		l1.addAll(1,extra);
		System.out.println(l1);

	}

}
