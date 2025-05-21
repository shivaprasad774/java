package demo0;

class sample24 {
	static void show() {
		System.out.println("hello world");
	}
	static class sample8{
		static void print() {
			System.out.println("java");
			show();
		}
	}
}
public class demo8{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample24.sample8.print();

	}

}
