package demo0;

public class demo9 extends Thread{
	public static void main(String[] args) {
		demo9 d1=new demo9();
		demo9 d2=new demo9();
		demo9 d3=new demo9();
		demo9 d4=new demo9();
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		System.out.println(d4.getName());
		System.out.println(d1.getState());
	}
}
