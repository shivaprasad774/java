package demo8demo0;

public class DEMO8 implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new DEMO8());
		t1.start();

	}

}
