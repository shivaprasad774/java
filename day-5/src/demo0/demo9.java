package demo0;

interface I1{
	void add();

} 
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
class demo9 implements I3{
	void div() {
		System.out.println("seeeee");
	}

	public void sub() {
		System.out.println("eeeeee");
	}
	public void mul() {
		System.out.println("haaaaa");
	}
	public void add() {
		System.out.println("ooooooo");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo9 i=new demo9(); 
		i.add();
		i.sub();
		i.mul();
		i.div();
	}

}
