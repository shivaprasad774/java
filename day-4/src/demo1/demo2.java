package demo1;

public class demo2 {
	public String firstName;
	public String lastName;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
}
	public String getFirstname() {
		return firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public static void main(String[] args) {
		demo2 d1=new demo2();
		d1.setFirstName("shiva");
		d1.setLastName("prasad");
		System.out.println(d1.getFirstname());
		System.out.println(d1.getLastname());
		
	}
}
	
