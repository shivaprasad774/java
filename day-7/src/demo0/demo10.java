package demo0;
import java.util.*;
public class demo10 extends Thread {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the class name");
			String className=sc.next();
			Class.forName(className);
			System.out.println("the class found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found:" + e.getMessage());
		}finally {
			sc.close();
		}
	}
}
