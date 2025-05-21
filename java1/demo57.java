package demo8demo0;

public class demo2 implements Runnable{
	public void run() {
		System.out.println("hihi");
		
	}
	public static void main(String[] args) {
		demo2 t1=new demo2();
		Thread t2=new Thread(t1);
		System.out.println("heloo");
		t2.start();
	}

}

