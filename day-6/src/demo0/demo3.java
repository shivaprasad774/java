package demo0;

class demo99 {
	final void show() {
		System.out.println("hi");
	}
}
public class demo3 extends demo99 {
	void add() {
		int a=34;
		System.out.println(a);
		a=74;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 d1=new demo3();
		d1.add();

	}

}
