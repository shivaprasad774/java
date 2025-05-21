package demo0;//multipath inheritance

class fruits {
	void benifits() {
		System.out.println("healthy");
	}
}
class apple extends fruits{
	void color() {
		System.out.println("red");
	}
}
class mango extends apple{
	void taste() {
		System.out.println("sweeet");
	}
}
class orange extends mango{
	void price() {
		System.out.println("50kg");
	}
}
public class demo3{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple a=new apple();
		mango m=new mango();
		orange o=new orange();
		a.color();
		a.benifits();
		m.taste();
		m.benifits();
		o.price();
		o.benifits();

	}

}
