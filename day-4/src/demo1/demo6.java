package demo1;

public class demo6 {
	int x;
	int y;
	public demo6(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public demo6(demo6 d1) {
		this.x=d1.x;
		this.y=d1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo6 d1=new demo6(34,65);
		demo6 d2=new demo6(d1);

	}

}
