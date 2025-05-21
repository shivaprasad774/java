package demo0;//multilevel inheritance

class bike {
	void speed() {
		System.out.println("250 km per hr");
	}
}
class jawa extends bike{
	void rev() {
		System.out.println("5000cc");
	}
}
class model extends jawa{
	void price() {
		System.out.println("1 lakh");
	}
}
public class demo2{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model d1=new model();
		d1.speed();
		d1.rev();
		d1.price();

	}

}
