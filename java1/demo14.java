package string;
abstract class test2{
	abstract void add();
	abstract void sum();
}
class demo4 extends test2{
	public void add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo4 d1 = new demo4();
		d1.add();
		d1.sum();
		

	}

}
