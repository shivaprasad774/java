package demo0;

import java.util.*;

public class demo5 {
	void add() throws ArithmeticException,InputMismatchException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
	//	try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	}
	public static void main(String[] args) {
		demo5 d1=new demo5();
		d1.add();
	
	}
}