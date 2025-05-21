package demo0;//multipath & multilevel hybrid inheritance

class movies {
	void genre() {
		System.out.println("action");
	}
}
class saalar extends movies{
	void fight() {
		System.out.println("kateramma fight");
	}
}
class hero extends saalar{
	void name() {
		System.out.println("prabhas");
	}
}
class heroine extends hero{
	void acting() {
		System.out.println("good");
	}
}
public class demo4{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero p=new hero();
		heroine s=new heroine();
		p.genre();
		p.fight();
		p.name();
		s.acting();
		//s.fight();
		//s.genre();

	}

}
