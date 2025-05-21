package demo8demo0;

public class demo9 extends Thread {
	String s;
	public demo9(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+" the demon thread");
		}else {
			System.out.println(s+" is a user thread");
		}
	}
	public static void main(String[] args) {
		demo9 d1=new demo9("thread1");
		demo9 d2=new demo9("thread2");
		demo9 d3=new demo9("thread3");
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.setDaemon(false);
		d3.start();
		
	}

}
