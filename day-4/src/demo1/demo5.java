package demo1;

public class demo5 {
	int a=40;
	int b=60;
	public demo5(int x,int y) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		demo5 d1=new demo5(35,24);
				d1.add();
	}

}
