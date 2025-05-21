package demo8demo0;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("task 1");
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				System.out.println("task 2");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}

}
