package demo1;

public class demo7 {
	
		float x;
		int y;
		float z;
		public demo7(){
			System.out.println("welcome to my profile");
		}
		public demo7(float x){
			this.x=x;
			System.out.println(x);
		}
		public demo7(float x,int y) {
			this.x=x;
			this.y=y;
			System.out.println(x+y);
		}
		public demo7(float x,int y,float z) {
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println(x+y+z);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			demo7 t=new demo7();
			demo7 t2=new demo7(9.0f);
			demo7 t3=new demo7(9.0f,693);
			demo7 t4=new demo7(9.0f,693,6.9f);

		}

	}
