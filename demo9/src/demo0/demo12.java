package demo0;
import java.util.*;
public class demo12 {
	public static void main(String[] args) {
		//Map<Integer,String> m1=new HashMap<Integer,String>();
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(null, null);
		m1.put(1, "cse");
		m1.put(8, "cseB");
		m1.put(5, "cseA");
		m1.put(9, "cseml");
		m1.put(7, "cseds");
		System.out.println(m1);
		for(Map.Entry<Integer, String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}
