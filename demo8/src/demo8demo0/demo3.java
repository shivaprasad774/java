package demo8demo0;

public class demo3 implements Runnable{
	public void run() {
		System.out.println("hihi");
		
	}
	public static void main(String[] args) {
		demo2 t1=new demo2();
		//demo2 t2=new demo2(); 
		Thread p1=new Thread(t1);//by using thread class it can run the run class
		Thread p2=new Thread(t1);
		System.out.println("heloo");
		p1.start();
		p2.start();
	}

}

