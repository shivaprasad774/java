package demo8demo0;

public class demo7 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println(i);
		if(i==0) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo7 d1=new demo7();
		d1.start();
		

	}

}
