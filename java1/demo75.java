package demo0;

import java.util.Stack;

public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(56);
		s1.push(35);
		s1.push(68);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
	}
}