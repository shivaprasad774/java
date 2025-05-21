package demo8demo0;
class test1 extends Thread{
	public void run() {
		System.out.println("guys");
	}
	
}
class test2 implements Runnable{
	public void run() {
		System.out.println("hello");
	}
	
}

public class demo4 {
	public static void main(String[] args) {
		test1 t1=new test1();
		test2 t2=new test2();
		//System.out.println("heyy");
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();
		
	}

}
