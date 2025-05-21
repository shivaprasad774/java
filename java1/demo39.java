package demo0;

public class demo1 {
	int a=45;
	void add() {
		int a=45;
		System.out.println(a);
		}
	void sub() {
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d1=new demo1();
		d1.sub();

	}

}
