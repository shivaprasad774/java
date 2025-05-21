package demo0;
interface t1{
	void add();
	void sub();
}
public class sample66 implements t1{
	public void add() {
	System.out.println("hi");
	}
	public void sub() {
	System.out.println("hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample66 d1=new sample66();
		d1.add();
		d1.sub();

	}

}
