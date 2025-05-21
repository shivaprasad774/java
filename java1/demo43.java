package demo0;

public class demo6 {
	void show() {
		System.out.println("heyy");
	}
	class sample6{
		void add() {
			System.out.println("hiiii");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo6 d1=new demo6();
		d1.show();
		demo6.sample6 s1=new demo6().new sample6();
		s1.add();
		

	}

}
