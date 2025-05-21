package demo0;
interface I5{
	void add();
}
class test16{
	void sub(){
		System.out.println("hello");
	}
} 
public class demo8 extends test16 implements I5 {
	public void add() {
		System.out.println("yooo");
	}
	public void sub() {
		System.out.println("eeeeee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo8 i=new demo8(); 
		i.add();
		i.sub();

	}

}
