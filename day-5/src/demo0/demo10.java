package demo0;

class test {
	public test() {
		System.out.println("good moring");
	}
	int x=99;
	void print() {
		System.out.println("helllo");
	}
}
public class demo10 extends test{
	public demo10() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo10 d1=new demo10();
		d1.show();

	}

}
