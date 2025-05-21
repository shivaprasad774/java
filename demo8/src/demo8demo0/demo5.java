package demo8demo0;
class test11 extends Thread{
	public void run() {
		System.out.println("heyy babyyy");
	}
}
class test12 extends test11{
	public void run() {
		System.out.println("light weight");
	}
}
class test13 implements Runnable{
	public void run() {
		System.out.println("lets start");
	}
}
class test14 extends test13{
	public void run() {
		System.out.println("workout");
	}
}
public class demo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test11 t1=new test11();
		test12 t2=new test12();
		test13 t3=new test13();
		test14 t4=new test14();
		t1.start();
		t2.start();
		Thread t5=new Thread(t3);
		t5.start();
		Thread t6=new Thread(t4);
		t6.start();
		
		
	}

}
