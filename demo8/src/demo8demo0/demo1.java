package demo8demo0;

public class demo1 extends Thread {
	public void run() {
		System.out.println("hihi");
		
	}
	public static void main(String[] args) {
		demo1 t1=new demo1();
		System.out.println("heloo");
		t1.run();
	}

}
