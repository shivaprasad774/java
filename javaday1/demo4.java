package javaday1;

public class demo4 {
	public static void main (String[] args) {
		int a=11;
		if(a%2==0) {
			System.out.println("multiplied by 2");
			if(a%3==0) {
				System.out.println("it multiplied with 3");
			}
			else {
				System.out.println("not multipled with 3");
			}
	}
		else {
			if(a<=10) {
				System.out.println("below ten");
			}
			else {
				System.out.println("above ten");
			}
		}
	}
}
