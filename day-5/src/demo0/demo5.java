package demo0;

public class demo5 {
	void show(){
		System.out.println("hi");
	}
	void show(int a) {
		System.out.println(a);
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(int a,int b,double d) {
		System.out.println(a+b-d);
	}
	public static void main(String[] args) {
		demo5 d=new demo5();
		d.show();
		d.show(34);
		d.show(3,7);
		d.show(5, 8,9.8);
	}
}
