package demo0;//single inheritance

class animal {
	void sleep() {
		System.out.println("sleeping");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class demo1{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1=new dog();
		d1.bark();
		d1.sleep();

	}

}
